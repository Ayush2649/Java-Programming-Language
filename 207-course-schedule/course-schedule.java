class Solution {
    public boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, boolean[] recStack){
        visited[u] = true;
        recStack[u] = true;

        for(int v : adj.get(u)){
            if(!visited[v] && isCycleDFS(adj, v, visited, recStack)){
                return true;
            } else if(recStack[v] == true){
                return true;
            }
        }

        recStack[u] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
        }

        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                if(isCycleDFS(adj, i, visited, recStack)){
                    return false;
                }
            }
        }

        return true;
    }
}