public class fib {
    public static int fibo(int n) { // O(2^n) time complexity
        if(n == 0 || n == 1){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboMemoizations(int n, int[] f){ // O(n) time complexity with memoization
        if(n == 0 || n == 1){
            return n;
        }

        if(f[n] != 0){
            return f[n];
        }

        f[n] = fiboMemoizations(n - 1, f) + fiboMemoizations(n - 2, f);
        return f[n];
    }

    public static int fiboTabulation(int n){ // O(n) time complexity with tabulation
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args){
        int n = 5;
        // int[] f = new int[n + 1];
        System.out.println(fiboTabulation(n));
    }
}