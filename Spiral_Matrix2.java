public class Spiral_Matrix2 {
    public static int[][] genrateMatrix(int n){
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        int[][] matrix = new int[n][n];
        int counter = 1;

        while(startRow <= endRow && startCol <= endCol){
            // Top
            for(int j = startCol; j <= endCol; j++){
                matrix[startRow][j] = counter++;
            }

            // Right
            for(int i = startRow + 1; i <= endRow; i++){
                matrix[i][endCol] = counter++;
            }

            // Bottom
            for(int j = endCol - 1; j >= startCol; j--){
                matrix[endRow][j] = counter++;
            }

            // Left 
            for(int i = endRow - 1; i >= startRow + 1; i--){
                matrix[i][startCol] = counter++;
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int value : row){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 4;
        int[][] printMatrix = genrateMatrix(n);
        printMatrix(printMatrix);
    }
}
