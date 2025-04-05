import java.util.ArrayList;
// import java.util.*;

public class Detecting_Cycle_In_a_Directed_Graph {

    public static boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, boolean[] inRecursion){
        visited[u] = true;
        inRecursion[u] = true;

        for(int v : adj.get(u)){
            if(visited[v] == false && isCycleDFS(adj, v, visited, inRecursion)){
                return true;
            } else if(inRecursion[v] == true){
                return true;
            }
        }

        inRecursion[u] = false;
        return false;
    }
    public static boolean isCyclic(ArrayList<ArrayList<Integer>> adj){
        int V = adj.size();
        boolean[] inRecursion = new boolean[V];
        boolean[] visited = new boolean[V];

        for(int i = 0 ; i < V; i++){
            if(!visited[i] && isCycleDFS(adj, i, visited, inRecursion)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test case 1: A graph with a cycle
        ArrayList<ArrayList<Integer>> graph1 = new ArrayList<>();
        graph1.add(new ArrayList<>()); // Node 0    
        graph1.add(new ArrayList<>()); // Node 1
        graph1.add(new ArrayList<>()); // Node 2
        graph1.add(new ArrayList<>()); // Node 3
        graph1.add(new ArrayList<>()); // Node 4
        graph1.get(0).add(1); // 0 -> 1
        graph1.get(1).add(2); // 1 -> 2
        graph1.get(2).add(0); // 2 -> 0 (cycle)
        graph1.get(3).add(4); // 3 -> 4
        graph1.get(4).add(3); // 4 -> 3 (cycle)
        System.out.println("Graph 1 has cycle: " + isCyclic(graph1)); // Expected output: true

        // Test case 2: A graph without a cycle
        ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();
        graph2.add(new ArrayList<>()); // Node 0
        graph2.add(new ArrayList<>()); // Node 1
        graph2.add(new ArrayList<>()); // Node 2
        graph2.add(new ArrayList<>()); // Node 3
        graph2.add(new ArrayList<>()); // Node 4
        graph2.get(0).add(1); // 0 -> 1
        graph2.get(1).add(2); // 1 -> 2
        graph2.get(2).add(3); // 2 -> 3
        graph2.get(3).add(4); // 3 -> 4
        System.out.println("Graph 2 has cycle: " + isCyclic(graph2)); // Expected output: false
    }
}
