class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int [n+1][n+1];
        for(int row=n-1;row>=0;row--){
            for(int coln=0;coln<=row;coln++){
                dp[row][coln]=triangle.get(row).get(coln)+Math.min(dp[row+1][coln],dp[row+1][coln+1]);
            }
        }

        return dp[0][0];
    }
}