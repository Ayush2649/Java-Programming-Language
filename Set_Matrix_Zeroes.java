public class Set_Matrix_Zeroes {
    public static void setZeroes(int[][] matrix){
        boolean firstRow = false;
        boolean firstCol = false;

        // Set the First Row and Col elements as Zero
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        firstRow = true;
                    } 
                    if(j == 0){
                        firstCol = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set the inner Matrix elemnets as zeroes
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Set the entire first col as Zero
        if(firstRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        // Set the entire first row as zero
        if(firstCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        System.out.println("Matrix Before Setting Zeroes");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix After Setting Zeroes");
        printMatrix(matrix);
    }   
}
