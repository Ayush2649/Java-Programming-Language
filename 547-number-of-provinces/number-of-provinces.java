class Solution {
    int n;
    public void dfs(int[][] isConnected, int u, boolean[] visited){
        visited[u] = true;

        for(int v = 0; v < n; v++){
            if(!visited[v] && isConnected[u][v] == 1){
                dfs(isConnected, v, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;

        // // 1. Array to ArrayList
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // for(int i = 0 ; i < V; i++){
        //     adj.add(new ArrayList<>());
        // }

        // for(int i = 0; i < V; i++){
        //     for(int j = 0; j < V; j++){
        //         if(isConnected[i][j] == 1 && i != j){
        //             adj.get(i).add(j);
        //             adj.get(j).add(i);
        //         }
        //     }
        // }

        // 2. Normal dfs
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                dfs(isConnected, i, visited);
            }
        }

        return count;
    }
}