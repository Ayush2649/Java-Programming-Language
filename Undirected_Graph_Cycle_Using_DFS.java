import java.util.*;
public class Undirected_Graph_Cycle_Using_DFS {

    public static boolean cycleUtil(ArrayList<ArrayList<Integer>> adj, int current, boolean[] visited, int parent) {
        visited[current] = true;

        for(int neighbour : adj.get(current)){
            if(neighbour == parent){
                continue;
            }
            if(!visited[neighbour]){
                return true;
            }
            if(cycleUtil(adj, neighbour, visited, current)){
                return true;
            }
        }
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];

        for(int i = 0; i < adj.size(); i++){
            if(!visited[i]) {
                if(cycleUtil(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        
        adj.get(1).add(2);
        adj.get(2).add(1);
        
        adj.get(2).add(3);
        adj.get(3).add(2);
        
        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(4).add(1); // Adding a cycle in the graph
        adj.get(1).add(4);

        // Check for cycle
        if (isCycle(adj)) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph does not contain a cycle.");
        }

    }
}
