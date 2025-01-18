public class Minimum_Cost_to_Make_at_Least_One_Valid_Path_in_a_Grid {
    private static int m, n;
    final static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int dfs(int i, int j, int[][] grid, boolean[][] visited, int cost) {
        if (i == m - 1 && j == n - 1) return cost;
        
        visited[i][j] = true;

        int minCost = Integer.MAX_VALUE;

        for(int dirIndex = 0; dirIndex <= 3; dirIndex++){
            int i_ = i + dir[dirIndex][0];
            int j_ = j + dir[dirIndex][1];

            if(i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && !visited[i_][j_]) {
                int nextCost = cost + (grid[i][j] - 1 != dirIndex ? 1 : 0);

                minCost = Math.min(minCost, dfs(i_, j_, grid, visited, nextCost));
            }
        }

        visited[i][j] = false;
        return minCost;
    }

    public static int minCost(int[][] grid){
        m = grid.length;
        n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        return dfs(0, 0, grid, visited, 0);
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}};
        System.out.println(minCost(grid));
    }
}
