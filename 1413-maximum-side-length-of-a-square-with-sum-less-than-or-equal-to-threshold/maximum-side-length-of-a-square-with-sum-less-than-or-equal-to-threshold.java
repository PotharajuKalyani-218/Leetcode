class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;

        // Prefix sum matrix
        int[][] prefix = new int[m + 1][n + 1];

        // Build prefix sums
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                             + prefix[i - 1][j]
                             + prefix[i][j - 1]
                             - prefix[i - 1][j - 1];
            }
        }

        int maxLen = 0;

        // Try all possible square sizes
        for (int size = 1; size <= Math.min(m, n); size++) {
            boolean found = false;

            for (int i = size; i <= m; i++) {
                for (int j = size; j <= n; j++) {

                    int sum = prefix[i][j]
                            - prefix[i - size][j]
                            - prefix[i][j - size]
                            + prefix[i - size][j - size];

                    if (sum <= threshold) {
                        maxLen = size;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }

        return maxLen;
    }
}
