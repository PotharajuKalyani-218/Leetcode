/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        int mx=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return mx;
        
    }
    public int dfs(TreeNode root){
    if(root==null) 
        return 0;
    int ls=Math.max(dfs(root.left),0);
    int rs=Math.max(dfs(root.right),0);
    int pathsum=root.val+ls+rs;
    mx=Math.max(mx,pathsum);
    return root.val+Math.max(ls,rs);
    }
}
