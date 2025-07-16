class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=2;i<=n;i++ ){
            if(rotate(i))
                c++;
        }
        return c;
    }
        
    public boolean rotate(int x){
        boolean res=false;
        while(x>0){
            int d=x%10;
            x/=10;
            if(d==3 || d==4 || d==7)
                return false;
            if(d==2 || d==5 || d==9 || d==6)
                res= true;
        }
        return res;

    }

}