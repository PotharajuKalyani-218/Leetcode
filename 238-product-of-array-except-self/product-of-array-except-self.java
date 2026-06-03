class Solution {
    public int[] productExceptSelf(int[] nums) {
      /*  int n=nums.length;
        int answer[]=new int[n];
        int product;
        for(int i=0;i<n;i++)
        {
             product=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                    product*=nums[j];
            }
            answer[i]=product;
        }
        return answer;*/
        int n=nums.length;
        int ans[]=new int[n];
         ans[0]=1;

        for(int i=1;i<n;i++)
        {
            ans[i]=ans[i-1]*nums[i-1];
        }
       long  rightproduct=1;
        for(int j=n-1;j>=0;j--)
        {
            ans[j]*=rightproduct;
            rightproduct*=nums[j];
        }
        return ans;
    }
}