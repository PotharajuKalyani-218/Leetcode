import java.lang.Math;
class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int mx=nums[0];
        for(int n:nums)
        {
            cs=cs+n;
            mx=Math.max(mx,cs);
            if(cs<0)
            cs=0;
        }
        return mx;

        
    }
}