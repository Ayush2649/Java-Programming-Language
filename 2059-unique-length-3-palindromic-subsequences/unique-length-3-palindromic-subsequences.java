class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> uniqueLetters = new HashSet<>();

        for(char ch : s.toCharArray()){
            uniqueLetters.add(ch);
        }

        int result = 0;

        for(char letter : uniqueLetters){
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
}