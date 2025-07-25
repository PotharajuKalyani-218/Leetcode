import java.lang.Math;
class Solution {
    public int maxProduct(int[] nums) {
        int mxp=nums[0];
        int mnp=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int t=mxp;
                mxp=mnp;
                mnp=t;
                
            }
            mxp=Math.max(nums[i],nums[i]*mxp);
            mnp=Math.min(nums[i],nums[i]*mnp);
            res=Math.max(res,mxp);

        }
        return res;
        
    }
}