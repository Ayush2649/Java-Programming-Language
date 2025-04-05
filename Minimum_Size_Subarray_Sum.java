public class Minimum_Size_Subarray_Sum {
    public static int minSubArrayLen(int target, int[] nums){
        int n = nums.length;
        int i = 0, j = 0;
        int minL = Integer.MAX_VALUE;
        int sum = 0;

        while(j < n){
            sum += nums[j];

            while(sum >= target){
                minL = Math.min(minL, j - i + 1);
                sum -= nums[i];
                 i++;
            }
            j++;
        }
        return minL == Integer.MAX_VALUE ? 0 : minL;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
