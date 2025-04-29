class Solution {
    public int[] kahns(ArrayList<ArrayList<Integer>> adj, int[] indegree, int n){
        Queue<Integer> q = new LinkedList<>();

        int[] result = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();
            result[count++] = u;

            for(int v : adj.get(u)){
                indegree[v]--;

                if(indegree[v] == 0){
                    q.offer(v);
                }
            }
        }

        if(count == n) return result;

        return new int[] {};
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int u = pre[0];
            int v = pre[1];

            adj.get(v).add(u);

            indegree[u]++;
        }

        return kahns(adj, indegree, numCourses);
    }
}