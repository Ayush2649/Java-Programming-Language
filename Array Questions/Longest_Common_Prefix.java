import java.util.Arrays;
public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] s){
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length - 1];

        int i = 0;
        while(i < s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return i == 0 ? "" : s1.substring(0, i);
    }

    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
