class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int maxLength = 0;

        for(int start = 0; start < n; start++){
            int currLength = 1;
            for(int pos = start + 1; pos < n; pos++){
                if(nums[pos] > nums[pos - 1]){
                    currLength++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, currLength);
        }

        for(int start = 0; start < n; start++){
            int currLength = 1;
            for(int pos = start + 1; pos < n; pos++){
                if(nums[pos] < nums[pos - 1]){
                    currLength++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }
}