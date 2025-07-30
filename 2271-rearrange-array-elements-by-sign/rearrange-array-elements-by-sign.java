class Solution {
    public int[] rearrangeArray(int[] nums) {
        int even=0;
        int odd=1;
        int  n=nums.length;
        int [] res=new int[n];
        for(int i:nums){
            if(i>=0)
            {
                res[even]=i;
                even+=2;
            }
            else
            {
                res[odd]=i;
                odd+=2;
            }
        }
        return res; 
        
    }
}