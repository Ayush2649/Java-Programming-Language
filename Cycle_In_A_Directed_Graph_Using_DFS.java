import java.util.*;
public class Cycle_In_A_Directed_Graph_Using_DFS {
    public static boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int current, boolean[] visited, boolean[] inRecursion) {
        visited[current] = true;
        inRecursion[current] = true;

        for(int neighbour : adj.get(current)){
            if(!visited[neighbour] && isCycleDFS(adj, neighbour, visited, inRecursion)){
                return true;
            } else if (inRecursion[neighbour]){
                return true;
            }
        }
        inRecursion[current] = false;
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!visited[i] && isCycleDFS(adj, i, visited, inRecursion)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 5;

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
        adj.get(4).add(1); // This edge introduces a cycle
        adj.get(1).add(4);

        if(isCycle(adj, V)){
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}
