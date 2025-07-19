import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Oranges {
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[] {i, j});
                } else if (grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int minutes = -1;

        while(!queue.isEmpty()){
            int size = queue.size();
            minutes++;

            for(int i = 0; i < size; i++){
                int[] pos = queue.poll();
                int r = pos[0];
                int c = pos[1];

                for(int[] dir : directions){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    
                    if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 1){
                        grid[nr][nc] = 2; // Rot the fresh orange
                        queue.offer(new int[] {nr, nc});
                        fresh--; // Decrease the count of fresh oranges
                    }
                }
            }
        }
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        System.out.println(orangesRotting(grid)); // Output: 4
    }
}
