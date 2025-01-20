import java.util.*;
import java.util.Arrays;

public class Dijkstras_Algorithm {

    public static class Pair{
        int distance;
        int node;

        Pair(int distance, int node){
            this.distance = distance;
            this.node = node;
        }
    }
    public static int[] dijkstra(ArrayList<ArrayList<Pair>> adj, int source){
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));

        int[] result = new int[adj.size()];
        Arrays.fill(result, Integer.MAX_VALUE);

        result[source] = 0;
        pq.add(new Pair(0, source));

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int dist = current.distance;
            int node = current.node;

            for(Pair neighbour : adj.get(node)){
                int adjNode = neighbour.node;
                int wt = neighbour.distance;

                if(dist + wt < result[adjNode]){
                    result[adjNode] = dist + wt;
                    pq.add(new Pair(result[adjNode], adjNode));
                }
            }
        }
        return result;
    }   

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Pair(2, 1));
        adj.get(0).add(new Pair(1, 4));
        adj.get(1).add(new Pair(3, 2));
        adj.get(4).add(new Pair(2, 2));
        adj.get(4).add(new Pair(4, 3));

        int source = 0;

        int[] distances = dijkstra(adj, source);

        System.out.println("Shortest distances from source node " + source + ": ");
        for(int i = 0; i < distances.length; i++){
            System.out.println("Node " + i + " -> Distance: " + distances[i]);
        }
    }
}
