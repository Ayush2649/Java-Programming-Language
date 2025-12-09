class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        long[] left = new long[200001];
        long[] right = new long[200001];

        for(int x : nums) right[x]++;

        long ans = 0;

        for(int j = 0; j < n; j++){
            int x = nums[j];
            right[x]--;
            int target = x * 2;

            if(target <= 200000){
                ans = (ans + left[target] * right[target]) % MOD; 
            }

            left[x]++;
        }

        return (int) ans;
    }
}