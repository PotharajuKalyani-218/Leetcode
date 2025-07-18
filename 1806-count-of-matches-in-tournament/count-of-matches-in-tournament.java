class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        int m=2;
        while(n>1){
            c+=(n/m);
            n=(n/m)+(n%m);
        }
        return c;
    }
}