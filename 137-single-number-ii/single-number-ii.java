class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        int b=0;
        for(int num:nums)
        {
            a^=(num&(~b));
            b^=(num&(~a));
        }
        return a;
        
    }
}