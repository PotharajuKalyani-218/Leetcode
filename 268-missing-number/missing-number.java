class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long sum=n*(n+1)/2;
        long total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        return (int) (sum-total);




        
    }
}