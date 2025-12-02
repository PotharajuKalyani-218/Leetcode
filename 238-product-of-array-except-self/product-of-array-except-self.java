class Solution {
    public int[] productExceptSelf(int[] nums) {
        //n-> length nums
        int n=nums.length;
        //create 3 arrays left,right,result
        int left []=new int[n];
        int right []=new int[n];
        int res []=new int[n];
        //update left array:1 to n-1 :left[i]=left[i-1]*nums[i-1];
          left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=(left[i-1]*nums[i-1]);
        }
        //update right array
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=(right[i+1]*nums[i+1]);
        }
        //update result
        for(int i=0;i<n;i++){
            res[i]=(right[i]*left[i]);
        }
        return res;
    }
}