import java.util.ArrayList;
public class Cycle_In_A_Directed_Graph_Using_DFS {

    public static boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] visited, boolean[] recStack){
        visited[curr] = true;
        recStack[curr] = true;

        for(int nbr: adj.get(curr)){
            if(!visited[nbr] && isCycleDFS(adj, nbr, visited,  recStack)){
                return true;
            } else if(recStack[nbr] == true){
                return true;
            }
        }

        recStack[curr] = false;
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!visited[i] && isCycleDFS(adj, i, visited, recStack)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 3;

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);

        if(isCycle(adj, V)){
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}