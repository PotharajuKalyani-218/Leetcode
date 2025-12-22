class Solution {
    public int maximalSquare(char[][] matrix) {

        if (matrix == null || matrix.length == 0) return 0;

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        int maxSide = 0;

        // First row
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j] - '0';
            maxSide = Math.max(maxSide, dp[0][j]);
        }

        // First column
        for (int i = 0; i < m; i++) {
            dp[i][0] = matrix[i][0] - '0';
            maxSide = Math.max(maxSide, dp[i][0]);
        }

        // DP computation
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(
                        Math.min(dp[i - 1][j], dp[i][j - 1]),
                        dp[i - 1][j - 1]
                    ) + 1;

                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        // Return area
        return maxSide * maxSide;
    }
}
