class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;

        long res = 0;
        long sum = 0;

        int i = 0, j = 0;

        while(j < n){
            sum += nums[j];

            while(i <= j && sum * (j - i + 1) >= k){
                sum -= nums[i];
                i++;
            }

            res += (j - i + 1);
            j++;

        }

        return res;
    }
}