import java.util.*;
import java.util.Arrays;
public class DFS {
    public static ArrayList<Integer> dfsOnGraph(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfs(0, adj, visited, result);
        return result;
    }

    public static void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result){
        visited[vertex] = true;
        result.add(vertex);

        for(int neighbour : adj.get(vertex)){
            if(!visited[neighbour]) {
                dfs(neighbour, adj, visited, result);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<Integer>(Arrays.asList(0, 3, 4)));
        adj.add(new ArrayList<>());                    // Neighbors of vertex 2
        adj.add(new ArrayList<>());                    // Neighbors of vertex 3
        adj.add(new ArrayList<>());  

        ArrayList<Integer> dfsTraversal = dfsOnGraph(adj);

        System.out.println("DFS Traversal of the graph : " + dfsTraversal);
    }
}
