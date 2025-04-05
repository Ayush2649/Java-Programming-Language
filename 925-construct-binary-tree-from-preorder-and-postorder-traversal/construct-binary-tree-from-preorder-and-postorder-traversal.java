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

    public TreeNode solve(int preStart, int postStart, int preEnd, int[] preorder, int[] postorder){
        if(preStart > preEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        if(preStart == preEnd){
            return root;
        }
        int nextNode = preorder[preStart + 1];

        int j = postStart;
        while(postorder[j] != nextNode){
            j++;
        }

        int num = j - postStart + 1;

        root.left = solve(preStart + 1, postStart, preStart + num, preorder, postorder);
        root.right = solve(preStart + num + 1, j + 1, preEnd, preorder, postorder);

        return root;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return solve(0, 0, n - 1, preorder, postorder);
    }
}