import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(){
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Minimum_Number_of_Operations_to_Sort_a_Binary_Tree_by_Level {
    private static int findMinSwaps(List<Integer> values){
        int n = values.size();
        int minSwaps = 0;
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            valueIndexMap.put(values.get(i), i);
        }

        List<Integer> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);

        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if (visited[i] || valueIndexMap.get(sortedValues.get(i)) == i) {
                continue;
            }

            int cycleLength = 0;
            int j = i;
            while(!visited[j]){
                visited[j] = true;
                j = valueIndexMap.get(sortedValues.get(j));
                cycleLength++;
            }

            minSwaps += cycleLength - 1;
        }

        return minSwaps;
    }

    public static int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int minSwaps = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> values = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode curr = queue.poll();
                values.add(curr.val);

                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            
            minSwaps += findMinSwaps(values);
        }
        return minSwaps;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
    
        System.out.println("Minimum Operations: " + minimumOperations(root));
    }
    
}
