class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int d=target-nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==d && i!=j)
                {
                    res[0]=j;
                    res[1]=i;
                }
                
            }
            
        }
        return res;
    }
}