import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>(), 0);
        return res;
    }

    // The start parameter correctly guides the recursion to the next element
    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> curr, int start) {
        // 1. Add the current subset to the result list
        res.add(new ArrayList<>(curr));

        // 2. Iterate through remaining elements from the 'start' index
        for (int i = start; i < nums.length; i++) {
            // Include the current element
            curr.add(nums[i]);
            
            // Recursively call backtrack with the next index (i + 1)
            backtrack(nums, res, curr, i + 1); 
            
            // Backtrack: remove the last added element to explore other subsets
            curr.remove(curr.size() - 1);
        }
    }
}
