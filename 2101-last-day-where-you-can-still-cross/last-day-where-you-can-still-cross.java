class Solution {
    int ROW;
    int COL;

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= ROW || j < 0 || j >= COL || grid[i][j] == 1) return false;

        if(i == ROW - 1) return true;

        grid[i][j] = 1;

        for(int[] dir : directions){
            int newI = i + dir[0];
            int newJ = j + dir[1];

            if(dfs(grid, newI, newJ)){
                return true;
            }
        }

        return false;
    }

    public boolean canCross(int[][] cells, int day){
        int[][] grid = new int[ROW][COL];

        for(int i = 0; i <= day; i++){
            int r = cells[i][0] - 1;
            int c = cells[i][1] - 1;
            grid[r][c] = 1;
        }

        for(int j = 0; j < COL; j++){
            if(grid[0][j] == 0 && dfs(grid, 0, j)){
                return true;
            }
        }

        return false;
    }

    public int latestDayToCross(int row, int col, int[][] cells) {
        ROW = row;
        COL = col;
        int lastDay = 0;

        int left = 0, right = cells.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(canCross(cells, mid)){
                lastDay = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastDay;
    }
}