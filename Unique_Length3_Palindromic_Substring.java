import java.util.*;
public class Unique_Length3_Palindromic_Substring {
    public static int countPalindromicSubsequence(String s){
        int n = s.length();
        Set<Character> UniqueLetters = new HashSet<>();

        for(char ch : s.toCharArray()){
            UniqueLetters.add(ch);
        }

        int result = 0;

        for(char letter : UniqueLetters){
            int firstIdx = -1;
            int lastIdx = -1;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == letter){
                    if(firstIdx == -1){
                        firstIdx = i;
                    }
                    lastIdx = i;
                }
            }

            Set<Character> set = new HashSet<>();
            for(int middle = firstIdx + 1; middle <= lastIdx - 1; middle++){
                set.add(s.charAt(middle));
            }

            result += set.size();
        }
        return result;
    }

    public static void main(String[] args){
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }
}
