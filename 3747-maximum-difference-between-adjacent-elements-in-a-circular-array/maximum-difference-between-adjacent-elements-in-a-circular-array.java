class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int curr_diff = Math.abs(nums[i] - nums[(i + 1) % n]);
            maxDiff = Math.max(maxDiff, curr_diff);
        }

        return maxDiff;
    }
}