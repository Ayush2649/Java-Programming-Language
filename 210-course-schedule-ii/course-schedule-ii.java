class Solution {
    public int[] topologicalSort(ArrayList<ArrayList<Integer>> adj, int[] indegree, int n){
        Queue<Integer> queue = new LinkedList<>();

        int[] result = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int u = queue.poll();
            result[count++] = u;

            for(int v : adj.get(u)){
                indegree[v]--;

                if(indegree[v] == 0){
                    queue.offer(v);
                }
            }
        }

        if(count == n){
            return result;
        }

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

        return topologicalSort(adj, indegree, numCourses);
    }
}