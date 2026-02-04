class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p = 0;
        int q = 0;
        while (p <n - 2 && nums[p] < nums[p + 1]) {
            p++;
        }
        if (p == 0)
            return false;
       q=p;
        while (q < n - 1 && nums[q] > nums[q + 1]) {

            q++;

        }
        if ((p == q) || (q == n - 1))
            return false;
        while (q<n - 1 && nums[q] < nums[q + 1]) {
            q++;
        }
        return q == n - 1;
    }
}