class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        boolean[] seen = new boolean[n * n + 1];

        int repeating = -1;
        for(int[] row : grid){
            for(int num : row){
                if(seen[num]){
                    repeating = num;
                } else {
                    seen[num] = true;
                }
            }
        }

        int missing = -1;
        for(int i = 1; i <= n * n; i++){
            if(!seen[i]){
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}