import java.util.*;
import java.util.Arrays;
public class BFS {
    public static ArrayList<Integer> bfsOnGraph(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[0] = true;
        queue.offer(0);

        while(!queue.isEmpty()){
            int vertex = queue.poll();
            result.add(vertex);

            for(int neighbour : adj.get(vertex)){
                // if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                // }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Add edges to the graph (0-based indexing)
        adj.add(new ArrayList<>(Arrays.asList(1, 2))); // Neighbors of vertex 0
        adj.add(new ArrayList<>(Arrays.asList(3, 4))); // Neighbors of vertex 1
        adj.add(new ArrayList<>());                    // Neighbors of vertex 2
        adj.add(new ArrayList<>());                    // Neighbors of vertex 3
        adj.add(new ArrayList<>());                    // Neighbors of vertex 4

        // Get the BFS traversal
        ArrayList<Integer> bfsTraversal = bfsOnGraph(adj);
        
        // Print the BFS traversal
        System.out.println("BFS Traversal of the graph: " + bfsTraversal);
    }
}
