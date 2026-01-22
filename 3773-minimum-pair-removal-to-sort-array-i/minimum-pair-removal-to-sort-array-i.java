import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        // Convert array to a List for easier removal
        List<Integer> list = new ArrayList<>();
        for (int x : nums) {
            list.add(x);
        }

        int operations = 0;
        // Continue until the list is non-decreasing
        while (!isNonDecreasing(list)) {
            int minSum = Integer.MAX_VALUE;
            int minIndex = 0;

            // Find the adjacent pair with the minimum sum
            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            // Replace nums[minIndex] with the sum and remove the next element
            list.set(minIndex, minSum);
            list.remove(minIndex + 1);

            operations++;
        }

        return operations;
    }

    // Helper to check if the list is already non-decreasing
    private boolean isNonDecreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
