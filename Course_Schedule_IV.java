import java.util.*;
public class Course_Schedule_IV {
    public static ArrayList<Boolean> checkIfPrerequisiteBruteForce(int numCourses, int[][] prerequisites, int[][] queries){
        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();

        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        }

        int Q = queries.length;
        ArrayList<Boolean> result = new ArrayList<>(Q);

        for(int i = 0; i < Q; i++){
            int u = queries[i][0];
            int v = queries[i][1];

            boolean[] visited = new boolean[numCourses];
            result.add(dfs(adj, u, v, visited));
        }

        return result;
    }

    private static boolean dfs(Map<Integer, ArrayList<Integer>> adj, int u, int v, boolean[] visited){
        visited[u] = true;

        if(u == v) return true;

        boolean isReachable = false;
        for(int neighbor : adj.getOrDefault(u, new ArrayList<>())){
            if(!visited[neighbor]){
                isReachable = isReachable || dfs(adj, neighbor, v, visited);
            }
        }
        return isReachable;
    }

    public static void main(String[] args) {
        int numCourses = 4; // Number of courses
        int[][] prerequisites = {
            {0, 1},
            {1, 2},
            {2, 3}
        }; // Prerequisite relationships
        
        int[][] queries = {
            {0, 1},
            {0, 3},
            {1, 3},
            {3, 0},
            {1, 2}
        }; // Queries to check if a course is a prerequisite of another

        ArrayList<Boolean> result = Course_Schedule_IV.checkIfPrerequisiteBruteForce(numCourses, prerequisites, queries);

        System.out.println("Query results:");
        for (int i = 0; i < queries.length; i++) {
            System.out.println("Is course " + queries[i][0] + " a prerequisite of course " + queries[i][1] + "? " + result.get(i));
        }
    }
}
