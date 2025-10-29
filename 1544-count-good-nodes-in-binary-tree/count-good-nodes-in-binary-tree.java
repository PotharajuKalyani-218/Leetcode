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
    public int goodNodes(TreeNode root) {
        return good(root,-1000000);
        
    }
    public int good(TreeNode root,int mx){
        int ct;
        if(root==null) return 0;
        if(root.val>=mx) ct=1;
        else ct=0;
        mx=Math.max(root.val,mx);
        ct+=good(root.left,Math.max(root.val,mx));
        ct+=good(root.right,Math.max(root.val,mx));
        return ct;
        


    }
}