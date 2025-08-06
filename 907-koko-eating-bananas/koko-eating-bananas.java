    public class Solution{
        public long calculateTotalHours(int[] piles, int speed) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (long) Math.ceil((double) pile / speed);
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int result = high; 
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (calculateTotalHours(piles, mid) <= h) {
                result = mid;  
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}

