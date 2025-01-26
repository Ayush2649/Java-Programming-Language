import java.util.*;
public class Kahns_Algorithm {
    public static ArrayList<Integer> Kahns(ArrayList<ArrayList<Integer>> adj){
        int N = adj.size();

        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[N];

        // First Fill the indegree array with the respective indegrees
        for(int u = 0; u < N; u++){
            for(int v : adj.get(u)){
                indegree[v]++;
            }
        }

        // Fill the queue with those whose indegree is 0
        for(int i = 0 ; i < N; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        // Simple BFS
        ArrayList<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int u = queue.poll();
            result.add(u);

            for(int v : adj.get(u)){
                indegree[v]--;

                if(indegree[v] == 0){
                    queue.add(v);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 6;

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

        ArrayList<Integer> result = Kahns(adj);

        System.out.println("Topological Sort:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}
