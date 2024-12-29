public class Single_Number {
    public static int singleNumber(int[] nums){
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
