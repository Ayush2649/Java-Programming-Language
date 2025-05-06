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
    static int maxDia;

    public int levels(TreeNode root){
        if(root == null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        int dia = Math.abs(leftLevel + rightLevel);
        maxDia = Math.max(dia, maxDia);
        return 1 + Math.max(rightLevel, leftLevel);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }
}