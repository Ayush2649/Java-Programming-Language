import java.util.Arrays;
public class Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition {
    public static int numSubSequence(int[] nums, int target){
        int n = nums.length;
        Arrays.sort(nums);

        int[] exp = new int[n];
        exp[0] = 1;

        for(int i = 1; i < n; i++){
            exp[i] = (exp[i - 1] * 2) % 100000007;
        }

        int left = 0;
        int right = n - 1;
        int count = 0;

        while(left <= right){
            if(nums[left] + nums[right] <= target){
                count = (count + exp[right - left]) % 100000007;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 3, 4, 5, 7};
        int target = 12;
        int numSubSequenc = numSubSequence(nums, target);
        System.out.println(numSubSequenc);
    }
}
