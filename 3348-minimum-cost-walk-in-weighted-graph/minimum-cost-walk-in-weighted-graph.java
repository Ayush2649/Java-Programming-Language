class Solution {
    public int find(int x, int[] parent){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x], parent);
    }

    public void union(int x, int y, int[] parent){
        parent[y] = x;
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] parent = new int[n];
        int[] cost = new int[n];
        Arrays.fill(cost, -1);
        int[] result = new int[query.length];

        for(int i = 0; i < n; i++){
            parent[i] = i;
        }

        for(int[] edge: edges){
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
}