    class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        // Step 1: Find the maximum element
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int longest = 0;
        int current = 0;

        // Step 2: Count the longest subarray of consecutive max elements
        for (int num : nums) {
            if (num == max) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }

        return longest;
    }
}

