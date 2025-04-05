class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int inversionCount = 0;

        for(int i = 1 ; i < n; i++){
            if(nums[i] < nums[i - 1]){
                inversionCount++;
            }
        }

        if(nums[0] < nums[n - 1]) inversionCount++;

        return inversionCount <= 1;
    }
}