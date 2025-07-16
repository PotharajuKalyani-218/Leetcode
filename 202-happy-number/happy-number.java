class Solution {
    public boolean isHappy(int n) {
        while(n!=4){
            if(n==1)
            return true;
            n=sumofdigits(n);
        }
        return false;
    }
        
    
     public int sumofdigits(int n){
        int result=0;
        while(n!=0){
           int  d=n%10;
            n=n/10;
            result=result+(d*d);
        }
        return result;
    }
}