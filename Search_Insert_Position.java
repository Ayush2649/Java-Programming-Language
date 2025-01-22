public class Search_Insert_Position {
    public static int findPosition(int[] nums, int target){
        int n = nums.length;
        int l = 0, r = n - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(findPosition(nums, target));
    }
}
