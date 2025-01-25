import java.util.*;
public class Topological_Sort_Using_DFS {
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[adj.size()];

        for(int i = 0 ; i < adj.size(); i++){
            if(!visited[i]){
                dfs(i, adj, visited, stack);
            }
        }

        ArrayList<Integer> topoOrder = new ArrayList<>();
        while(!stack.isEmpty()){
            topoOrder.add(stack.pop());
        }

        return topoOrder;
    }

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack){
        visited[node] = true;

        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, adj, visited, stack);
            }
        }

        stack.push(node);
    }

    public static void main(String[] args) {
        // Example usage
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (u -> v)
        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> result = topologicalSort(adj);

        System.out.println("Topological Sort:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}
