class Solution {
    public int maxSum(int[][] grid) {
        int  nr=grid.length;
        int nc=grid[0].length;

        int s=0;
        int mx=0;

        for(int i=1;i<nr-1;i++){
            for(int j=1;j<nc-1;j++){
                s=grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1]+grid[i][j]+grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1];
                mx=Math.max(mx,s);
            }

        }
        
        return mx;
    }
}