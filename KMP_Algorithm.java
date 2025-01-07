import java.util.*;
public class KMP_Algorithm {
    public static ArrayList<Integer> search(String pat, String txt){
        ArrayList<Integer> result = new ArrayList<>();
        int N = txt.length();
        int M = pat.length();

        int[] LPS = computeLps(pat);

        int i = 0;
        int j = 0;

        while(i < N){
            if(j < M && pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }

            if(j == M){
                result.add(i - j);
                j = LPS[j - 1];
            } else if(i < N && (j == 0 || pat.charAt(j) != txt.charAt(i))){
                if(j != 0){
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }
        return result;
    }

    public static int[] computeLps(String pattern){
        int M = pattern.length();
        int[] LPS = new int[M];
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
                    i++;
                }
            }
        }
        return LPS;
    }

    public static void main(String[] args) {
        String txt = "abxabcabcaby";
        String pat = "abcaby";
        List<Integer> result = search(pat, txt);
        System.out.println(result);
    }
}
