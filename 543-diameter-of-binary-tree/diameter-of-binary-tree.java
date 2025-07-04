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
    public int diameterOfBinaryTreeRec(TreeNode root, int[] res){
        if(root == null) return 0;

        int lDiam = diameterOfBinaryTreeRec(root.left, res);
        int rDiam = diameterOfBinaryTreeRec(root.right, res);

        res[0] = Math.max(res[0], lDiam + rDiam);

        return 1 + Math.max(lDiam, rDiam);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        diameterOfBinaryTreeRec(root, res);
        return res[0];
    }
}