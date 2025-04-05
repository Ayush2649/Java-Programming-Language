class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        for(int[] row : grid) {
            for(int col : row) {
                freq[col]++;
            }
        }

        int[] ans = new int[2];
        for(int i = 1; i <= n * n; i++){
            if(freq[i] == 2) ans[0] = i;
            else if (freq[i] == 0) ans[1] = i;
        }

        return ans;
    }
}