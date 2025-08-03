class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int maxFruits = 0;
        int left = 0, sum = 0;

        // Sliding window over sorted fruit positions
        for (int right = 0; right < n; right++) {
            sum += fruits[right][1];

            // While the cost to collect fruits in the window is more than k, move left
            while (left <= right && !canReach(fruits[left][0], fruits[right][0], startPos, k)) {
                sum -= fruits[left][1];
                left++;
            }

            maxFruits = Math.max(maxFruits, sum);
        }

        return maxFruits;
    }

    // Helper to check if we can collect all fruits from posLeft to posRight with <= k steps
    private boolean canReach(int posLeft, int posRight, int startPos, int k) {
        // Minimum steps needed: go to one end and reach the other
        int goLeftFirst = Math.abs(startPos - posLeft) + (posRight - posLeft);
        int goRightFirst = Math.abs(startPos - posRight) + (posRight - posLeft);
        return Math.min(goLeftFirst, goRightFirst) <= k;
    }
}
