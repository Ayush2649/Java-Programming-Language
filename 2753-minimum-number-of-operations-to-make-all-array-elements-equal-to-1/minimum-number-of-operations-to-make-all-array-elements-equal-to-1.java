class Solution {
    public int minOperations(int[] nums) {
        int n  = nums.length;
        int ones = 0;

        for(int num : nums){
            if(num == 1) ones++;
        }

        if(ones > 0) return n - ones;

        int totalGCD = nums[0];
        for(int num : nums){
            totalGCD = gcd(totalGCD, num);
        }

        if(totalGCD != 1) return -1;

        int minLen = n;
        for(int i = 0; i < n; i++){
            int g = nums[i];
            for(int j = i + 1; j < n; j++){
                g = gcd(g, nums[j]);
                if(g == 1){
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        return (minLen - 1) + (n - 1);
    }

    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}