public class IsSeubsequence { // Q4. Is Subsequence - 4.5/10
    public static boolean isSubsequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int s1Pointer = 0, s2Pointer = 0;

        while(s2Pointer < n){
            if(s1Pointer < m && s1.charAt(s1Pointer) == s2.charAt(s2Pointer)){
                s1Pointer++;
            }
            s2Pointer++;
        }

        return s1Pointer == m;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
    }
}
