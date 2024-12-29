import java.util.*;
public class Arrays_2D{

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                      if(matrix[i][j] == key){
                        System.out.println("Key found at (" + i + "," + j + ")");
                        return true;
                      }
                }
            }
            System.out.println("Key not found");
            return false;
    }

    public static void greatestElement(int matrix[][]){
        int greatestElement = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > greatestElement){
                    greatestElement = matrix[i][j];
                }
            }
        }
        System.out.println("The graetest element is " + greatestElement);
    }

    public static void smallestElement(int matrix[][]){
        int smallestElement = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < smallestElement){
                    smallestElement = matrix[i][j];
                }
            }
        }
        System.out.println("The smallest element is " + smallestElement);
    }


    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix : ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
                for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            search(matrix, 5);
            greatestElement(matrix);
            smallestElement(matrix);
            sc.close();
    }
}