class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for(String word : wordlist){
            String lower = word.toLowerCase();
            caseMap.putIfAbsent(lower, word);

            String normalized = normalize(lower);
            vowelMap.putIfAbsent(normalized, word);
        }

        String[] result = new String[queries.length];
        for(int i = 0; i < queries.length; i++){
            String query = queries[i];

            if(exactWords.contains(query)){
                result[i] = query;
                continue;
            }

            String lowerQuery = query.toLowerCase();
            if(caseMap.containsKey(lowerQuery)){
                result[i] = caseMap.get(lowerQuery);
                continue;
            }

            String normalizedQuery = normalize(lowerQuery);
            if(vowelMap.containsKey(normalizedQuery)){
                result[i] = vowelMap.get(normalizedQuery);
                continue;
            }

            result[i] = "";
        }

        return result;
    }

    public String normalize(String word){
        StringBuilder sb = new StringBuilder();
        for(char c : word.toCharArray()){
            if(isVowel(c)){
                sb.append('*');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public boolean isVowel(char c){
        return "aeiou".indexOf(c) >= 0;
    }
}