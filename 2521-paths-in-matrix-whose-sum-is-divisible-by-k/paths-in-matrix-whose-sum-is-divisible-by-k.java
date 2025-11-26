class Solution {
    int m, n;
    Integer[][][] dp;
    static final int MOD = 1_000_000_007;

    public int solve(int i, int j, int currSum, int[][] grid, int k){
        if(i >= m || j >= n) return 0;

        if(i == m - 1 && j == n - 1){
            return (currSum + grid[i][j]) % k == 0 ? 1 : 0;
        }

        if(dp[i][j][currSum] != null) return dp[i][j][currSum];

        int down = solve(i + 1, j, (currSum + grid[i][j]) % k, grid, k);
        int right = solve(i, j + 1, (currSum + grid[i][j]) % k, grid, k);

        return dp[i][j][currSum] = (down + right) % MOD;
    }

    public int numberOfPaths(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        dp = new Integer[m][n][k];

        return solve(0, 0, 0, grid, k);    
    }
}