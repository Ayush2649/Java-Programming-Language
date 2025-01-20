import java.util.*;
public class First_Completely_Painted_Row_or_Column {
    private static boolean isRowPainted(int[][] mat, int row){
        for(int col = 0; col < mat[0].length; col++){
            if(mat[row][col] > 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isColPainted(int[][] mat, int col){
        for(int row = 0; row < mat.length; row++){
            if(mat[row][col] > 0){
                return false;
            }
        }
        return true;
    }

    public static int firstCompletelyPaintedRow(int[][] mat, int[] arr){
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int val = mat[i][j];
                map.put(val, new int[] {i, j});
            }
        }

        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            int[] coordinates = map.get(val);
            int row = coordinates[0], col = coordinates[1];

            mat[row][col] *= -1;

            if(isRowPainted(mat, row) || isColPainted(mat, col)){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[][] mat = {{1,4}, {2,3}};
        System.out.println(firstCompletelyPaintedRow(mat, arr));
    }
}
