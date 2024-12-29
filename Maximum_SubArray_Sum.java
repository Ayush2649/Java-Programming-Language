public class Maximum_SubArray_Sum {
    // public static void main(String[] args){
    //     int n = 5;
    //     int[] arr = {1, 2, 3, 4, 5};
        
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int st = 0; st < arr.length; st++){
    //         int currSum = 0;
    //         for(int end = st; end < arr.length; end++){
    //             currSum += arr[end];
    //             maxSum = Math.max(maxSum, currSum);
    //         }
    //     }
    //     System.out.println("Maximum SubArray Sum = " + maxSum);
    // } Brute Force Approach - O(n^2)

    public static int maxSubArraySum(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int val : nums){
            currSum += val;
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    } // Kadane's Algorithm - O(n)

    public static void main(String[] args){
        int[] nums = {3, -4, 5, 4, -1, 7, -8};
        int maximumSum = maxSubArraySum(nums);
        System.out.println(maximumSum);
    }
}
