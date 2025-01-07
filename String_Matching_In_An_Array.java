import java.util.*;
public class String_Matching_In_An_Array {
    public static ArrayList<String> stringMatching(String[] words){ // Approach 1
        ArrayList<String> result = new ArrayList<>();
        int n = words.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    // Approach 2 - KMP Algorithm
    public static boolean searchKMP(String pat, String txt){
        // ArrayList<Integer> result = new ArrayList<>();
        int N = txt.length();
        int M = pat.length();

        int[] LPS = new int[M];
        computeLps(pat, LPS);

        int i = 0;
        int j = 0;

        while(i < N){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }

            if(j == M){
                // result.add(i - j);
                // j = LPS[j - 1];
                return true;
            } else if(i < N && pat.charAt(j) != txt.charAt(i)){
                if(j != 0){
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public static void computeLps(String pattern, int[] LPS){
        int M = pattern.length();
        int len = 0;

        LPS[0] = 0;

        int i = 1;
        while(i < M){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            } else {
                if(len != 0){
                    len = LPS[len - 1];
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }
    }

    public static ArrayList<String> stringMatching2(String[] words){ 
        ArrayList<String> result = new ArrayList<>();
        int n = words.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(searchKMP(words[i], words[j])){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching2(words));
    }
}
