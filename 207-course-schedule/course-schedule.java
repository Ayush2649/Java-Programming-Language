class Solution {
    public boolean CDBFS(ArrayList<ArrayList<Integer>> adj, int[] indegree, int numCourses){
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();
            count++;

            for(int v : adj.get(u)){
                indegree[v]--;

                if(indegree[v] == 0){
                    q.offer(v);
                }
            }
        }

        return count == numCourses;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];

            adj.get(v).add(u);

            indegree[u]++;
        }

        return CDBFS(adj, indegree, numCourses);
    }
}