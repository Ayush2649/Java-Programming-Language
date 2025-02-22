class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int m = Math.abs(res);

        for(int i = 0; i < n; i++){
            int d = Math.abs(nums[i]);
            if(d < m || d == m && nums[i] > res){
                m = d;
                res = nums[i];
            }
        }
        
        return res;
    }
}