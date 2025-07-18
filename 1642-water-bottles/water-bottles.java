class Solution {
    public int numWaterBottles(int n, int m) {
        int c=n;
        while(n>=m){
            c+=(n/m);
            n=(n/m)+(n%m);
        }
        return c;
        
    }
}