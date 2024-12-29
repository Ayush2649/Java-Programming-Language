import java.util.Arrays;
public class Longest_Common_Subsequence {

    static int lcsUtil(String s1, String s2, int idx1, int idx2, int[][] dp){
        if(idx1 < 0 || idx2 < 0){
            return 0;
        }

        if(dp[idx1][idx2] != -1){
            return dp[idx1][idx2];
        }

        if(s1.charAt(idx1) == s1.charAt(idx2)){
            return dp[idx1][idx2] = 1 + lcsUtil(s1, s2, idx1 - 1, idx2 - 1, dp);
        } else {
            return dp[idx1][idx2] = Math.max(lcsUtil(s1, s2, idx1, idx2 - 1, dp), lcsUtil(s1, s2, idx1 - 1, idx2, dp));
        }
    }

    public static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return lcsUtil(s1, s2, m - 1, n - 1, dp);
    }

    public static void main(String[] args){
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2));
    }
}
