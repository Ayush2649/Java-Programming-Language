class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;

        int arrSize = 0;
        for(int i = 0; i < n; i += 2){
            arrSize += nums[i];
        }

        int[] res = new int[arrSize];

        int startIdx = 0;
        for(int i = 0; i < n; i += 2){
            Arrays.fill(res, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }

        return res;
    }
}