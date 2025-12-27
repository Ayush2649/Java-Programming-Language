class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int[] leftSum = new int[n];
        leftSum[0] = 0;
        for(int i = 1; i < n; i++){
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }

        int[] rightSum = new int[n];
        rightSum[n - 1] = 0;
        for(int i = n - 2; i >= 0; i--){
            rightSum[i] += nums[i + 1] + rightSum[i + 1];
        }

        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}