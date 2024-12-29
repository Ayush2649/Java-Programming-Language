import java.util.Arrays;
public class Minimize_Maximum_Pair_Sum_in_Array {
    
    public static int minPairSum(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        Arrays.sort(nums);

        int result = 0;

        while(left < right){
            int sum = nums[left] + nums[right];
            result = Math.max(result, sum);
            left++;
            right--;
        }

        return result; 
    }

    public static void main(String[] args){
        int[] nums = {3, 5, 3, 4, 2, 6};
        int minPairSu = minPairSum(nums);
        System.out.println(minPairSu);
    }
}
