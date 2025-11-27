class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSubArraySum = nums[0];
        int maxSubArraySum = nums[0];
        int minSubArraySum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currSubArraySum = Math.max(nums[i], nums[i] + currSubArraySum);
            maxSubArraySum = Math.max(currSubArraySum, maxSubArraySum);
        }

        currSubArraySum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currSubArraySum = Math.min(nums[i], nums[i] + currSubArraySum);
            minSubArraySum = Math.min(currSubArraySum, minSubArraySum);
        }

        return Math.max(Math.abs(maxSubArraySum), Math.abs(minSubArraySum));
    }
}