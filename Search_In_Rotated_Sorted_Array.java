public class Search_In_Rotated_Sorted_Array {

    private static int findPivot(int[] nums, int n){
        int l = 0, r = n - 1;

        while(l < r){
            int mid = l + (r - l) / 2;

            if(nums[mid] > nums[r]){
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    private static int binarySearch(int l, int r, int[] nums, int target){
        int idx = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == target){
                idx = mid;
                break;
            } else if(nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }

    public static int search(int[] nums, int target){
        int n = nums.length;

        int pivotIndex = findPivot(nums, n);

        int idx = binarySearch(0, pivotIndex - 1, nums, target);

        if(idx != -1) return idx;

        idx = binarySearch(pivotIndex, n - 1, nums, target);

        if(idx != -1) return idx;

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target)); // Output: 4
    }
}
