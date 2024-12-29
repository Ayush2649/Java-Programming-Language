public class Search_a_2D_Matrix_II{
    // public static boolean searchMatrix(int[][] matrix, int target){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
        
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < m; j++){
    //             if(matrix[i][j] == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // } Brute Force Approach - O(n * m)

    // public static boolean binarySearch(int[] nums, int target){
    //     int n = nums.length;
    //     int left = 0;
    //     int right = n -1;

    //     while(left <= right){
    //         int mid = (left + right) / 2;
    //         if(nums[mid] == target){
    //             return true;
    //         } else if(nums[mid] < target){
    //             left = mid + 1;
    //         } else {
    //             right = mid - 1;
    //         }
    //     }

    //     return false;
    // }

    // public static boolean searchMatrix(int[][] matrix, int target){
    //     int n = matrix.length;
    //     int m = matrix[0].length;

    //     for(int i = 0; i < n; i++){
    //         boolean flag = binarySearch(matrix[i], target);
    //         if(flag == true){
    //             return true;
    //         }
    //     }
    //     return false;
    // } Better Approach - O(n * log m)

    public static boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;

        while(row < n && col >= 0){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return false;
    } // Optimal approach - O(n) 

    public static void main(String[] args){
        int[][] matrix = {{1, 4, 7, 11, 15},
                          {2, 5, 8, 12, 19},
                          {3, 6, 9, 16, 22},
                          {10, 13, 14, 17, 24},
                          {18, 21, 23, 26, 30}};
        int target = 14;
        System.out.println(searchMatrix(matrix, target));
    }
}