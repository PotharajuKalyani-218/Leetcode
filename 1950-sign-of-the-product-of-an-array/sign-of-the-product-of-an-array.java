class Solution {
    public int arraySign(int[] nums) {
        int sign=1;
        for(int x:nums){
         if(x<0)
        sign=-sign;
        if(x==0)
        sign=0;
         
        }

        return sign;
        
    }
}