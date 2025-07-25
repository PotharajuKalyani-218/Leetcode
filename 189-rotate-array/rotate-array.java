class Solution {
    public void rotate(int[] nums, int k) {
        /*int n=nums.length;
         k=k%n;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        } */
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int [] A,int start,int end){
        while(start<end)
        {
            int t=A[start];
            A[start]=A[end];
            A[end]=t;
            start++;
            end--;
        }
    }
}