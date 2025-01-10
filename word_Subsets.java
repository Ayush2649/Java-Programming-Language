import java.util.*;
public class word_Subsets {
    public static ArrayList<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> result = new ArrayList<>();

        int[] freq2 = new int[26];
        for(String word : words2){
            int[] temp = new int[26];

            for(char ch : word.toCharArray()){
                temp[ch - 'a']++;

                freq2[ch - 'a'] = Math.max(freq2[ch - 'a'], temp[ch - 'a']);
            }
        }

        for(String word : words1){
            int[] temp = new int[26];

            for(char ch : word.toCharArray()){
                temp[ch - 'a']++;
            }

            if(isSubset(freq2, temp)){
                result.add(word);
            }
        }

        return result;
    }

    private static boolean isSubset(int[] freq2, int[] temp){
        for(int i = 0 ; i < 26 ; i++){
            if(temp[i] < freq2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e", "o"};
        System.out.println(wordSubsets(words1, words2));
    }
}
