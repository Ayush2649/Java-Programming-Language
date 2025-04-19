class Solution {
    int n;
    
    public void bfs(int[][] isConnected, boolean[] visited, int curr){
        Queue<Integer> q = new LinkedList<>();

        q.offer(curr);
        visited[curr] = true;

        while(!q.isEmpty()){
            int u = q.poll();

            for(int v = 0; v < n; v++){
                if(!visited[v] && isConnected[u][v] == 1){
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;

        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // for(int i = 0; i < n; i++){
        //     adj.add(new ArrayList<>());
        // }

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(isConnected[i][j] == 1){
        //             adj.get(i).add(j);
        //             adj.get(j).add(i);
        //         }
        //     }
        // }

        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(isConnected, visited, i);
                count++;
            }
        }

        return count;
    }
}