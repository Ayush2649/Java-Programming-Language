class Solution {
    private double memo[][];

    public double soupServings(int n) {
        int u = (n + 24) / 25;

        if(u > 200) return 1.0;

        memo = new double[u + 1][u + 1];
        for(int i = 0; i <= u; i++){
            for(int j = 0; j <= u; j++){
                memo[i][j] = -1.0;
            }
        }    

        return dfs(u, u);
    }

    private double dfs(int a, int b){
        if(a <= 0 && b <= 0) return 0.5;
        if(a <= 0) return 1.0;
        if(b <= 0) return 0.0;

        if(memo[a][b] != -1.0) return memo[a][b];

        double ans = 0.25 * (dfs(a - 4, b) +
                             dfs(a - 3, b - 1) + 
                             dfs(a - 2, b - 2) + 
                             dfs(a - 1, b - 3));

        memo[a][b] = ans;
        return ans;
    }
}