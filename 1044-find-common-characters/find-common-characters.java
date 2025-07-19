class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        int[] commonChars = new int[26];
        int[] currentChars = new int[26];
        List<String> result = new ArrayList<>();

        for(char ch : words[0].toCharArray()){
            commonChars[ch - 'a']++;
        }

        for(int i = 1; i < n; i++){
            Arrays.fill(currentChars, 0);

            for(char ch : words[i].toCharArray()){
                currentChars[ch - 'a']++;
            }

            for(int letter = 0; letter < 26; letter++){
                commonChars[letter] = Math.min(commonChars[letter], currentChars[letter]);
            }
        }

        for(int letter = 0; letter < 26; letter++){
            for(int commonCount= 0; commonCount < commonChars[letter]; commonCount++){
                result.add(String.valueOf((char) (letter + 'a')));
            }
        }

        return result;
    }
}