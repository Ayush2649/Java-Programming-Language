class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(grid[r][c] == 2){
                    queue.offer(new int[] {r, c});
                } else if(grid[r][c] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int minutes = -1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while(!queue.isEmpty()){
            int size = queue.size();
            minutes++;

            for(int i = 0; i < size; i++){
                int[] pos = queue.poll();
                int row = pos[0], col = pos[1];

                for(int[] dir : directions){
                    int nr = row + dir[0], nc = col + dir[1];

                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.offer(new int[] {nr, nc});
                    } 
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}