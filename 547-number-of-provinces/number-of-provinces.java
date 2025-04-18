class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] visited){
        visited[curr] = true;

        for(int nbr: adj.get(curr)){
            if(!visited[nbr]){
                dfs(adj, nbr, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;

        // 1. Array to ArrayList
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        // 2. Normal dfs
        boolean[] visited = new boolean[V];
        int count = 0;

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                count++;
                dfs(adj, i, visited);
            }
        }

        return count;
    }
}