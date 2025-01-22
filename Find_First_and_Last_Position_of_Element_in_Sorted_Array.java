public class Find_First_and_Last_Position_of_Element_in_Sorted_Array{

    public static int find_left_most(int[] nums, int target, int n){
        int l = 0, r = n - 1;

        int left_most = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                left_most = mid;
                r = mid - 1;
            } else if (nums[mid] < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return left_most;
    }

    public static int find_right_most(int[] nums, int target, int n){
        int l = 0, r = n - 1;

        int right_most = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                right_most = mid;
                l = mid + 1;
            } else if (nums[mid] < target){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return right_most;
    }

    public static int[] searchRange(int[] nums, int target){
        int n = nums.length;

        int left_most = find_left_most(nums, target, n);
        int right_most = find_right_most(nums, target, n);

        return new int[] {left_most, right_most};
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);

        for(int row : result){
            System.out.print(row + " ");
        }
    }
}