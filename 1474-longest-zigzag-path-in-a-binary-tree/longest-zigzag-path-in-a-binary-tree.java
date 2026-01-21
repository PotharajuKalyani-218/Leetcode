class Solution {

    int mx = 0;   // ✅ global variable to store max ZigZag length

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        // Start zigzag from root's left and right
        dfs(root.left, 0, 1);   // 0 → came from left
        dfs(root.right, 1, 1);  // 1 → came from right

        return mx;
    }

    public void dfs(TreeNode root, int dir, int zlen) {
        if (root == null)
            return;

        mx = Math.max(mx, zlen);

        if (dir == 0) {  
            // last move was LEFT → must go RIGHT to continue zigzag
            dfs(root.left, 0, 1);           // restart
            dfs(root.right, 1, zlen + 1);   // continue zigzag
        } else {
            // last move was RIGHT → must go LEFT
            dfs(root.left, 0, zlen + 1);    // continue zigzag
            dfs(root.right, 1, 1);          // restart
        }
    }
}
