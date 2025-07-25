class Solution {
    public int maxProfit(int[] prices) {
        int mnp=prices[0];
        int mxp=0;
        int pft=0;
        for(int i=1;i<prices.length;i++)
        {
            mxp=Math.max(mxp,prices[i]-mnp);
            mnp=Math.min(mnp,prices[i]);
        }
        return mxp;
        
    }
}