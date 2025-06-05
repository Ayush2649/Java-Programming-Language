class Solution {
    public int climbStairs(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            if(i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public int climb(int n, int[] ways) { // Memoization
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = climb(n - 1, ways) + climb(n - 2, ways);

        return ways[n];
    }
}