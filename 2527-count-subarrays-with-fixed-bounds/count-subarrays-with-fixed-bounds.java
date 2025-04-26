class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minKPosition = -1;
        int maxKPosition = -1;
        int culpritIdx = -1;
        long ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK) culpritIdx = i;
            if(nums[i] == minK) minKPosition = i;
            if(nums[i] == maxK) maxKPosition = i;

            long smaller = Math.min(minKPosition, maxKPosition);

            long temp = smaller - culpritIdx;

            ans += (temp <= 0) ? 0 : temp;
        }

        return ans;
    }
}