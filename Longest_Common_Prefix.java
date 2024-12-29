import java.util.Arrays;
public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

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

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
