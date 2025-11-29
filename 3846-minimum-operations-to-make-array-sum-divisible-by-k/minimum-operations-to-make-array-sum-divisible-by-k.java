class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        int count = 0;
        while(sum % k != 0){
            sum -= 1;
            count++;
        }

        return count;
    }
}