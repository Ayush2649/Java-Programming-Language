public class Number_Of_Ways_To_Split_Array {
    public static int numSplit(int[] nums){
        int n = nums.length;

        long sum = 0;
        for(int num: nums){
            sum += num;
        }

        long leftSum = 0;
        long rightSum = 0;
        int split = 0;

        for(int i = 0; i < n - 1; i++){
            leftSum += nums[i];
            rightSum = sum - leftSum;

            if(leftSum >= rightSum){
                split++;
            }
        }
        return split;
    }

    public static void main(String[] args){
        int[] nums = {10, 4, -8, 7};
        System.out.println(numSplit(nums));
    }
}
