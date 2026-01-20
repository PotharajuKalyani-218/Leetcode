class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);

            // Even numbers → impossible
            if ((val & 1) == 0) {
                ans[i] = -1;
            } else {
                int t = countTrailingOnes(val);
                ans[i] = val - (1 << (t - 1));
            }
        }

        return ans;
    }

    private int countTrailingOnes(int n) {
        int count = 0;
        while ((n & 1) == 1) {
            count++;
            n >>= 1;
        }
        return count;
    }
}
