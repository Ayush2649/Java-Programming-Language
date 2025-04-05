// class Solution {
//     public int[] findRedundantConnection(int[][] edges) {
//         int n = edges.length;
//         Map<Integer, List<Integer>> map = new HashMap<>();

//         for(int[] edge : edges){
//             int u = edge[0];
//             int v = edge[1];

//             if(map.containsKey(u) && map.containsKey(v)){
//                 boolean[] visited = new boolean[n + 1];
//                 if(dfs(map, u, v, visited)){
//                     return edge;
//                 }
//             }

//             map.putIfAbsent(u, new ArrayList<>());
//             map.putIfAbsent(v, new ArrayList<>());
//             map.get(u).add(v);
//             map.get(v).add(u);
//         }

//         return new int[] {};
//     }

//     public boolean dfs(Map<Integer, List<Integer>> map, int u, int v, boolean[] visited){
//         visited[u] = true;
//         if(u == v) return true;

//         for(int neighbour : map.get(u)){
//             if(visited[neighbour]) continue;
//             if(dfs(map, neighbour, v, visited)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class DSU{
    int[] parent;
    int[] rank;

    public DSU(int n){
        parent = new int[n + 1];
        rank = new int[n + 1];
        for(int i = 1; i <= n; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x){
        if(x != parent[x]){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void Union(int x, int y){
        int x_parent = find(x);
        int y_parent = find(y);

        if(x_parent == y_parent) return;

        if(rank[x_parent] > rank[y_parent]){
            parent[y_parent] = x_parent;
        } else if(rank[y_parent] > rank[x_parent]){
            parent[x_parent] = y_parent;
        } else {
            parent[y_parent] = x_parent;
            rank[x_parent]++;
        }
    }
}

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU dsu = new DSU(n);

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(dsu.find(u) == dsu.find(v)){
                return edge;
            }
            dsu.Union(u, v);
        }
        return new int[0];
    }
}