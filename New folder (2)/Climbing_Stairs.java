
import java.util.Arrays;

public class Climbing_Stairs {
    public static int noOfWaysToClimb(int n){ // O(2^n) time complexity
        if(n == 0){
            return 1;
        } 

        if(n < 0){
            return 0;
        }

        return noOfWaysToClimb(n - 1) + noOfWaysToClimb(n - 2);
    }

    public static int noOfWays(int n, int[] ways){ // O(n) time complexity with memoization
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = noOfWays(n - 1, ways) + noOfWays(n - 2, ways) + noOfWays(n - 3, ways);

        return ways[n];
    }

    public static int numOfWaysTab(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        // System.out.println(noOfWaysToClimb(n));
        // System.out.println(noOfWays(n, ways));
        System.out.println(numOfWaysTab(n));
    }
}

