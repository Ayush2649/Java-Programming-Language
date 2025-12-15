class Solution {
    public long getDescentPeriods(int[] prices) {
        long len = 1;
        long ans = 1;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] == prices[i - 1] - 1){
                len++;
            } else {
                len = 1;
            }

            ans += len;
        }

        return ans;
    }
}