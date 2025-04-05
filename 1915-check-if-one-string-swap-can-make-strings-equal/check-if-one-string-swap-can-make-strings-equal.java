class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1 == s2){
            return true;
        }

        char[] s1FrequencyArray = new char[26];
        char[] s2FrequencyArray = new char[26];
        int numDifs = 0;

        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 != ch2){
                numDifs++;

                if(numDifs > 2) return false;
            }

            s1FrequencyArray[ch1 - 'a']++;
            s2FrequencyArray[ch2 - 'a']++;
        }
        return Arrays.equals(s1FrequencyArray, s2FrequencyArray);
    }
}