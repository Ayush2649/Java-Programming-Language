class Solution {
    public int climbStairs(int n){
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        return climb(n, ways);
    }

    public int climb(int n, int[] ways) {
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = climb(n - 1, ways) + climb(n - 2, ways);

        return ways[n];
    }
}