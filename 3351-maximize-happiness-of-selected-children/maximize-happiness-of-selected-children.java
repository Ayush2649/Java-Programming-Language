class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness);
        long ans = 0;

        for(int i = 0; i < k; i++){
            int val = happiness[n - 1 - i] - i;
            if(val <= 0) break;
            ans += val; 
        }

        return ans;
    }
}