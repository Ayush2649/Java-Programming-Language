public class remove_Duplicates_From_Sorted_Array {
    public static int removeDuplicates(int[] nums){
        int n = nums.length;

        int left = 0;
        int right = 1;

        while(right < n){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,3,4,6};
        int removeDuplicate = removeDuplicates(nums);
        System.out.println(removeDuplicate);
    }
} // O(n)
