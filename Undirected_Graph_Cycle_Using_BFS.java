import java.util.*;
public class Undirected_Graph_Cycle_Using_BFS{
    public static boolean cycleBFS(ArrayList<ArrayList<Integer>> graph, int current, boolean[] visited){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{current, -1});
        visited[current] = true;

        while(!queue.isEmpty()){
            int[] nodeInfo = queue.poll();
            int node = nodeInfo[0];
            int parent = nodeInfo[1];

            for(int neighbour : graph.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(new int[]{neighbour, node});
                } else if (neighbour != parent){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++){
            if(!visited[i]){
                if(cycleBFS(graph, i, visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++){
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
        // adj.get(4).add(1); // This edge introduces a cycle
        adj.get(1).add(4);

        if(isCycle(adj)){
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}