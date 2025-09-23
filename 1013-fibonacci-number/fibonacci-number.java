class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int prev2 = 0, prev1 = 1, curr = 0;

        for(int i = 2; i <= n; i++){
            curr = (prev1 + prev2) % 100000007;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}