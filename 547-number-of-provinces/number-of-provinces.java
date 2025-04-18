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

        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(isConnected, i, visited);
                count++;
            }
        }

        return count;
    }
}