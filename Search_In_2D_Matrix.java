public class Search_In_2D_Matrix {
    public static boolean search(int[][] nums, int target){
        if(nums.length == 0 || nums == null) return false;
        
        int rows = nums.length;
        int cols = nums[0].length;
        int i = 0;
        int j = cols - 1;

        while(i < rows && j >= 0)
        {
            if(nums[i][j] > target){
                j--;
            } else if(nums[i][j] < target){
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] nums = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 11;
        if(search(nums, target)){
            System.out.println("The element exists in the matrix");
        } else {
            System.out.println("The element does not exists in the matrix");
        }
    }
}
