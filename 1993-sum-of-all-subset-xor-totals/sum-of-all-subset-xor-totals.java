class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        int n = nums.length;

        for(int num : nums){
            res |= num;
        }

        return res << (n - 1);
    }
}