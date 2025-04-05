import java.util.*;
public class DFS {
    public static ArrayList<Integer> dfsOnGraph(ArrayList<ArrayList<Integer>> adj){
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();

        DFSearch(adj, visited, 0, ans);
        
        return ans;
    }

    public static void DFSearch(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int curr, ArrayList<Integer> ans){
        visited[curr] = true;
        ans.add(curr);

        for(int nbr : adj.get(curr)){
            if(!visited[nbr]){
                DFSearch(adj, visited, nbr, ans);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;

        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(0);
        adj.get(3).add(1);
        adj.get(4).add(1);

        ArrayList<Integer> dfsTraversal = dfsOnGraph(adj);

        System.out.println("DFS Traversal of the graph : " + dfsTraversal);
    }
}
