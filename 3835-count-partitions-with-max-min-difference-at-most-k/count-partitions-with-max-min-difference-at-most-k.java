class Solution {
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        long MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        long[] ps = new long[n + 2];

        dp[0] = 1;
        ps[1] = 1;

        Deque<Integer> maxDQ = new ArrayDeque<>();
        Deque<Integer> minDQ = new ArrayDeque<>();

        int left = 0;
        for(int right = 0; right < n; right++){
            while(!maxDQ.isEmpty() && nums[maxDQ.peekLast()] <= nums[right]){
                maxDQ.pollLast();
            }   
            maxDQ.addLast(right);

            while(!minDQ.isEmpty() && nums[minDQ.peekLast()] >= nums[right]){
                minDQ.pollLast();
            }
            minDQ.addLast(right);

            while(!maxDQ.isEmpty() && !minDQ.isEmpty() && (nums[maxDQ.peekFirst()] - nums[minDQ.peekFirst()]) > k){
                if(maxDQ.peekFirst() == left) maxDQ.pollFirst();
                if(minDQ.peekFirst() == left) minDQ.pollFirst();
                left++;
            }

            long sum = (ps[right + 1] - ps[left] + MOD) % MOD;

            dp[right + 1] = sum;

            ps[right + 2] = (ps[right + 1] + dp[right + 1]) % MOD;
        }

        return (int) dp[n];
    }
}