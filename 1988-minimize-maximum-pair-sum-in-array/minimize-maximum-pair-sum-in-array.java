import java.util.*;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);   // Step 1: sort array
        
        int left = 0;
        int right = nums.length - 1;
        int maxPairSum = 0;
        
        // Step 2: pair smallest with largest
        while (left < right) {
            int pairSum = nums[left] + nums[right];
            maxPairSum = Math.max(maxPairSum, pairSum);
            left++;
            right--;
        }
        
        return maxPairSum;
    }
}
