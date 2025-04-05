class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }

        return maxProfit;
    }
}