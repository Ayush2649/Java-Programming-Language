class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(map.containsKey(u) && map.containsKey(v)){
                boolean[] visited = new boolean[n + 1];
                if(dfs(map, u, v, visited)){
                    return edge;
                }
            }

            map.putIfAbsent(u, new ArrayList<>());
            map.putIfAbsent(v, new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }

        return new int[] {};
    }

    public boolean dfs(Map<Integer, List<Integer>> map, int u, int v, boolean[] visited){
        visited[u] = true;
        if(u == v) return true;

        for(int neighbour : map.get(u)){
            if(visited[neighbour]) continue;
            if(dfs(map, neighbour, v, visited)){
                return true;
            }
        }
        return false;
    }
}