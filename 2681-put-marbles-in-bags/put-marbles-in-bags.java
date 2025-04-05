class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;

        int[] pairSum = new int[n - 1];

        for(int i = 0; i < n - 1; i++){
            pairSum[i] = weights[i] + weights[i + 1];
        }

        Arrays.sort(pairSum);

        long minSum = 0;
        long maxSum = 0;

        for(int i = 0; i < k - 1; i++){
            minSum += pairSum[i];
            maxSum += pairSum[n - i - 2];
        }

        return maxSum - minSum;
    }
}