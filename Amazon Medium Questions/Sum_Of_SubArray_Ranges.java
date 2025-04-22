public class Sum_Of_SubArray_Ranges { // O(n^2)
    public static long Sum(int[] nums){
        int n = nums.length;
        long res = 0;

        for(int i = 0; i < n ; i++){
            int minVal = nums[i];
            int maxVal = nums[i];

            for(int j = i; j < n; j++){
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                res += (maxVal - minVal);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Sum(nums)); // Output: 4
    }
}
