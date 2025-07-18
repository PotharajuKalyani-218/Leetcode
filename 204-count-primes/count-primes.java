class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean []p=new boolean[n];
        for(int i=2;(i*i)<=n;i++){
            if(!p[i])
            for(int j=i*i;j<n;j+=i){
                p[j]=true;
            }
        }
            for(int k=2;k<n;k++){
            if(!p[k])
                c++;
        }
        
        return c;
        
    }
}