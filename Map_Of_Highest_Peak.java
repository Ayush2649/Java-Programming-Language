import java.util.*;
import java.util.Arrays;

public class Map_Of_Highest_Peak {
    public  static int[][] highestPeak(int[][] isWater){
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] height = new int[m][n];

        Queue<int[]> que = new LinkedList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(isWater[i][j] == 1){
                    que.offer(new int[] {i, j});
                    height[i][j] = 0;
                } else {
                    height[i][j] = -1;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!que.isEmpty()){
            int N = que.size();
            while(N-- > 0){
                int[] cur = que.poll();
                int i = cur[0];
                int j = cur[1];

                for(int[] dir : directions){
                    int i_ = i + dir[0];
                    int j_ = j + dir[1];
                    if(i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && height[i_][j_] == -1){
                        height[i_][j_] = height[i][j] + 1;
                        que.offer(new int[] {i_, j_});
                    }
                }
            }
        }
        return height;
    }

    public static void main(String[] args) {
        int[][] isWater = {{0,0,1}, {1,0,0}, {0,0,0}};
        int[][] result = highestPeak(isWater);

        System.out.println("Height Map:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
