/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();

    public void buildParentMap(TreeNode root, TreeNode parent){
        if(root == null) return;
        parentMap.put(root, parent);
        buildParentMap(root.left, root);
        buildParentMap(root.right, root);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParentMap(root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        queue.offer(target);
        visited.add(target);
        int distance = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            if(distance == k){
                List<Integer> result = new ArrayList<>();
                for(TreeNode node : queue){
                    result.add(node.val);
                }
                return result;
            }

            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();

                if(curr.left != null && !visited.contains(curr.left)){
                    queue.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right != null && !visited.contains(curr.right)){
                    queue.offer(curr.right);
                    visited.add(curr.right);
                }
                TreeNode parent = parentMap.get(curr);
                if(parent != null && !visited.contains(parent)){
                    queue.offer(parent);
                    visited.add(parent);
                }
            }

            distance++;
        }
        return new ArrayList<>();
    }
}