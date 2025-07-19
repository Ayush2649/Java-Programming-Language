import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class All_Nodes_Distance_K_in_Binary_Tree {
    HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public void buildParentmap(TreeNode node, TreeNode parent){
        if(node == null) return;

        parentMap.put(node, parent);
        buildParentmap(node.left, node);
        buildParentmap(node.right, node);
    }

    public ArrayList<Integer> distanceK(TreeNode root, TreeNode target, int k){
        buildParentmap(root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        queue.offer(target);
        visited.add(target);
        int distance = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            if(distance == k){
                ArrayList<Integer> res = new ArrayList<>();
                for(TreeNode node : queue){
                    res.add(node.val);
                }
                return res;
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

    public static void main(String[] args) {
        All_Nodes_Distance_K_in_Binary_Tree solution = new All_Nodes_Distance_K_in_Binary_Tree();

        // Example usage
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode target = root.left; // Target node with value 
        int k = 2;

        ArrayList<Integer> result = solution.distanceK(root, target, k);
        System.out.println(result); // Output: [7, 4, 1]
    }
}
