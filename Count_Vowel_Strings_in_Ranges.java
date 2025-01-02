public class Count_Vowel_Strings_in_Ranges {
    public static int[] vowelStrings(String[] words, int[][] queries){
        int N = words.length;
        int Q = queries.length;
        int[] result = new int[Q];
        int[] cumSum = new int[N];

        int sum = 0;
        for(int i = 0; i < N; i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                sum++;
            }
            cumSum[i] = sum;
        }

        for(int i = 0; i < Q; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            result[i] = cumSum[right] - (left > 0 ? cumSum[left - 1] : 0);
        }

        return result;
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args){
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        int[] result = vowelStrings(words, queries);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }
    }
}
