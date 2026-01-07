class Solution {
    private long totalSum = 0;
    private long maxProduct = 0;
    private static final int MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        totalSum = treeSum(root);
        computeMax(root);
        return (int)(maxProduct % MOD);
    }

    // First DFS: compute total sum
    private long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

    // Second DFS: compute max product
    private long computeMax(TreeNode node) {
        if (node == null) return 0;

        long left = computeMax(node.left);
        long right = computeMax(node.right);

        long subSum = node.val + left + right;
        maxProduct = Math.max(maxProduct, subSum * (totalSum - subSum));

        return subSum;
    }
}
