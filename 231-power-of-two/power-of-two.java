class Solution {
    public boolean isPowerOfTwo(int n) {
                if(n<=0)
        return false;
        while(n%2==0){
            n=n/2;
        }
            if(n==1 || n==2 )
             return true;
            else
             return false;

        
    }
}