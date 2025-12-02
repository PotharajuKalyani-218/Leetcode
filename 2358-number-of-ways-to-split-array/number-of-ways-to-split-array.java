class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long ls []=new long [n];
        long rs[]=new long [n];
        int c=0;
        ls[0]=nums[0];
        for(int i=1;i<n;i++){
            ls[i]=ls[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            rs[i]=rs[i+1]+nums[i+1];
        }
        for(int i=0;i<n-1;i++){
            if(ls[i]>=rs[i])
                c++;
        }
        return c;
        
    }
}