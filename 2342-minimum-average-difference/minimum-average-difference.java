class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long left[]=new long [n];
        long right[]=new long[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i];
        }
        long mindiff=Integer.MAX_VALUE;
        int idx=0;
        for(int i=n-2;i>=0;i--){
            right[i]=(right[i+1]+nums[i+1]);

        }
    
        for(int i=0;i<n-1;i++){
            long leftavg=left[i]/(i+1);
            long rightavg=right[i]/(n-1-i);
            long curdiff=Math.abs(leftavg-rightavg);
            if(curdiff<mindiff){
                mindiff=curdiff;
                idx=i;
            }
            if((left[n-1]/n)<mindiff)
                idx=n-1;
        }
        
        
    return idx;
        
    }
}