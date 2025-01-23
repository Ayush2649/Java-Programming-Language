public class Count_Servers_That_Communicate {
    public static int countServersBruteForce(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    boolean isFind = false;

                    for(int col = 0; col < n; col++){
                        if(grid[i][col] == 1 && col != j){
                            isFind = true;
                            break;
                        }
                    }

                    for(int row = 0; row < m; row++){
                        if(grid[row][j] == 1 && row != i){
                            isFind = true;
                            break;
                        }
                    }

                    if(isFind){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int countServersOptimized(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int[] indexRowCount = new int[m];
        int[] indexColCount = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    indexColCount[j]++;
                    indexRowCount[i]++;
                }
            }
        }

        int result = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && (indexColCount[j] > 1 || indexRowCount[i] > 1)){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,0},{1,1}};
        System.out.println(countServersOptimized(grid));
    }
}
