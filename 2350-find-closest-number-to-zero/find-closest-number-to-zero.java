class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int closest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(Math.abs(nums[i]) < Math.abs(closest)){
                closest = nums[i];
            }
            if(Math.abs(nums[i]) == Math.abs(closest)){
                closest = Math.max(nums[i], closest);
            }
        }
        return closest;
    }
}