class Solution {
    public int findMiddleIndex(int[] nums) {
        //n is length of nums
        int n=nums.length;
        //create 2 arrays left,right sums;
        int ls []=new int[n];
        int rs []=new int[n];
        //update the sums
        for(int i=1;i<n;i++){
            ls[i]=ls[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rs[i]=rs[i+1]+nums[i+1];

        }
        //result
        for(int i=0;i<n;i++){
            if(ls[i]==rs[i])
                return i;
        }
        return -1;
        
    }
}