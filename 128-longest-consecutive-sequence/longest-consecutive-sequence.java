class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        if(n == 0) return 0;

        int cnt = 1, res = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i - 1]){
                continue;
            } else if(nums[i] == nums[i - 1] + 1){
                cnt++;
            } else {
                cnt = 1;
            }

            res = Math.max(res, cnt);
        }

        return res;
    }
}