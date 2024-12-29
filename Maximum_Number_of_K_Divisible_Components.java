import java.util.*;
public class Maximum_Number_of_K_Divisible_Components {
    public static int dfs(List<List<Integer>> adj, int values[], int k, int count[], int curr, int parent){
        long sum = values[curr];
        for(int nbr : adj.get(curr)){
            if(nbr != parent){
                sum += dfs(adj, values, k, count, nbr, curr);
            }
        }

        sum %= k;
        if(sum == 0){
            count[0]++;
        }

        return (int) sum;
    }

    public static int maxKDivisibleComponents(int n, int[][] edges, int values[], int k){
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] count = {0};
        dfs(adj, values, k, count, 0, -1);
        return count[0];
    }

    public static void main(String[] args){
        int n = 5;
        int[][] edges = {
            {0, 2},
            {1, 2},
            {1, 3},
            {2, 4}
        };
        int[] values = {1, 8, 1, 4, 4};
        int k = 6;
        int result = maxKDivisibleComponents(n, edges, values, k);
        System.out.println("Maximum K-Divisible Components: " + result);
    }
}
