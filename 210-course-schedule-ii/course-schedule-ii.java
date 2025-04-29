class Solution {
    boolean hasCycle;
    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int curr, Stack<Integer> stack, boolean[] inRecursion){
        visited[curr] = true;
        inRecursion[curr] = true;

        for(int v : adj.get(curr)){
            if(inRecursion[v] == true){
                hasCycle = true;
                return;
            }

            if(!visited[v]){
                dfs(adj, visited, v, stack, inRecursion);
            }
        }

        stack.push(curr);
        inRecursion[curr] = false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] inRecursion = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();
        hasCycle = false;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int u = pre[0];
            int v = pre[1];

            adj.get(v).add(u);
        }

        for(int i = 0; i < numCourses; i++){
            if(!visited[i]){
                dfs(adj, visited, i, stack, inRecursion);
            }
        }

        if(hasCycle == true){
            return new int[] {};
        }

        int[] result = new int[numCourses];
        int index = 0;

        while(!stack.isEmpty()){
            result[index++] = stack.pop();
        }

        return result;
    }
}