import java.util.*;
import java.util.Arrays;
public class BFS {
    public static void BFSearch(ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> answer, int curr){
        Queue<Integer> q = new LinkedList<>();

        q.add(curr);
        visited[curr] = true;

        while(!q.isEmpty()){
            int u = q.poll();
            answer.add(u);

            for(int nbr : adj.get(u)){
                if(!visited[nbr]){
                    q.add(nbr);
                    visited[nbr] = true;
                }
            }
        }
    }

    public static ArrayList<Integer> bfsOnGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> answer = new ArrayList<>();

        BFSearch(adj, visited, answer, 0);

        return answer;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 5;
        
        // Add edges to the graph (0-based indexing)
        adj.add(new ArrayList<>(Arrays.asList(1, 2))); // Neighbors of vertex 0
        adj.add(new ArrayList<>(Arrays.asList(3, 4))); // Neighbors of vertex 1
        adj.add(new ArrayList<>());                    // Neighbors of vertex 2
        adj.add(new ArrayList<>());                    // Neighbors of vertex 3
        adj.add(new ArrayList<>());                    // Neighbors of vertex 4

        // Get the BFS traversal
        ArrayList<Integer> bfsTraversal = bfsOnGraph(V, adj);
        
        // Print the BFS traversal
        System.out.println("BFS Traversal of the graph: " + bfsTraversal);
    }
}
