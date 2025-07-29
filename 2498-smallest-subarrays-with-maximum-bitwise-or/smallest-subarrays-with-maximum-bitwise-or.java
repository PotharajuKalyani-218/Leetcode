    class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] last = new int[32]; // to track last position a bit is seen
        
        for (int i = n - 1; i >= 0; i--) {
            for (int b = 0; b < 32; b++) {
                if ((nums[i] & (1 << b)) != 0) {
                    last[b] = i;
                }
            }

            int maxLast = i;
            for (int b = 0; b < 32; b++) {
                maxLast = Math.max(maxLast, last[b]);
            }

            result[i] = maxLast - i + 1;
        }

        return result;
    }
}

        
