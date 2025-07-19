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
    static boolean flag;
    public int levels(TreeNode root){
        if(root == null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        int diff = Math.abs(leftLevel - rightLevel);
        if(diff > 1) flag = false;
        return 1 + Math.max(leftLevel, rightLevel);
    }

    public boolean isBalanced(TreeNode root) {
        flag = true;
        levels(root);
        return flag;
    }
}