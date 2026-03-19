class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] prefX = new int[rows][cols];
        int[][] prefY = new int[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Current cell contribution
                int xVal = (grid[i][j] == 'X') ? 1 : 0;
                int yVal = (grid[i][j] == 'Y') ? 1 : 0;

                // Inclusion-exclusion: top + left - corner overlap
                int top    = (i > 0) ? prefX[i-1][j] : 0;
                int left   = (j > 0) ? prefX[i][j-1] : 0;
                int corner = (i > 0 && j > 0) ? prefX[i-1][j-1] : 0;
                prefX[i][j] = xVal + top + left - corner;

                top    = (i > 0) ? prefY[i-1][j] : 0;
                left   = (j > 0) ? prefY[i][j-1] : 0;
                corner = (i > 0 && j > 0) ? prefY[i-1][j-1] : 0;
                prefY[i][j] = yVal + top + left - corner;

                // Valid submatrix: equal counts AND at least one X
                if (prefX[i][j] == prefY[i][j] && prefX[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}