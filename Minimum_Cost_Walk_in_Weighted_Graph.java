import java.util.Arrays;
public class Minimum_Cost_Walk_in_Weighted_Graph {
    public static int[] minimumCost(int n, int[][] edges, int[][] query){
        int[] parent = new int[n];
        int[] cost = new int[n];
        Arrays.fill(cost, -1);
        int[] result = new int[query.length];

        for(int i = 0; i < n; i++){
            parent[i] = i;
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            int parent_u = find(u, parent);
            int parent_v = find(v, parent);

            if(parent_u != parent_v){
                cost[parent_u] &= cost[parent_v];
                union(parent_u, parent_v, parent);
            }

            cost[parent_u] &= w; 
        }

        for(int i = 0; i < query.length; i++){
            int s = query[i][0];
            int d = query[i][1];

            int parent_s = find(s, parent);
            int parent_d = find(d, parent);

            if(s == d){
                result[i] = 0;
            } else if(parent_s != parent_d){
                result[i] = -1;
            } else {
                result[i] = cost[parent_s];
            }
        }

        return result;
    }

    public static int find(int x, int[] parent){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x], parent);
    }

    public static void union(int x, int y, int[] parent){
        parent[y] = x;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {
                {0, 1, 7},
                {1, 3, 7},
                {1, 2, 1}
        };
        int[][] queries = {
            {0, 3},
            {3, 4},
            {2, 3}
        };
        System.out.println(Arrays.toString(minimumCost(n, edges, queries)));
    }
}
