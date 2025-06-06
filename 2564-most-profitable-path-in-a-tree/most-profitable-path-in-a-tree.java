class Solution {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    Map<Integer, Integer> bobMap = new HashMap<>();
    int aliceIncome;

    boolean DFSBob(int curr, int t, boolean[] visited) {
        visited[curr] = true;
        bobMap.put(curr, t);

        if (curr == 0) { // reached target
            return true;
        }

        for (int ngbr : adj.getOrDefault(curr, new ArrayList<>())) {
            if (!visited[ngbr]) {
                if (DFSBob(ngbr, t + 1, visited)) {
                    return true;
                }
            }
        }

        bobMap.remove(curr);
        return false;
    }

    void DFSAlice(int curr, int t, int income, boolean[] visited, int[] amount) {
        visited[curr] = true;

        if (!bobMap.containsKey(curr) || t < bobMap.get(curr)) {
            income += amount[curr];
        } else if (t == bobMap.get(curr)) {
            income += (amount[curr] / 2);
        }

        if (adj.getOrDefault(curr, new ArrayList<>()).size() == 1 && curr != 0) { // leaf node
            aliceIncome = Math.max(aliceIncome, income);
        }

        /*
            {1} -> (2, 3)
            2 -> 1
            3 -> 1,....
            (1) ---- (2)
             |
             |
             (3)------.....
        */

        for (int ngbr : adj.getOrDefault(curr, new ArrayList<>())) {
            if (!visited[ngbr]) {
                DFSAlice(ngbr, t + 1, income, visited, amount);
            }
        }
    }

    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length; // n nodes (0 to n-1)
        aliceIncome = Integer.MIN_VALUE;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        // DFS on Bob for finding time to reach each node till 0
        int time = 0;
        boolean[] visited = new boolean[n];
        DFSBob(bob, time, visited);

        int income = 0;
        Arrays.fill(visited, false);
        DFSAlice(0, 0, income, visited, amount);

        return aliceIncome;
    }
}
