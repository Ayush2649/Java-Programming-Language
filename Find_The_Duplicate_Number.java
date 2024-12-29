public class Find_The_Duplicate_Number {
    
    // public static int findDuplicateTLE(int[] nums){
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 return nums[i];
    //             }
    //         }
    //     }
    //     return -1;
    // } Brute Force Approach - O(n^2)

    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    } // Hare And Tortoise - O(n)

    public static void main(String[] args){
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);
    }
}
