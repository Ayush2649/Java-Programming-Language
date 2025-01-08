public class Count_Prefix_And_Suffix_Pairs1 {
    public static int countPrefixSuffixPairs(String[] words){
        int n = words.length;
        int count = 0;

        for(int i = 0; i < n; ++i){
            for(int j = i + 1; j < n; ++j){
                String str1 = words[i];
                String str2 = words[j];

                if(str1.length() > str2.length()) continue;

                if(str2.startsWith(str1) && str2.endsWith(str1)){
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
}
