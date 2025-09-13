class Solution {
    public int maxFreqSum(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int maxVowel = 0;
        int maxConsonent = 0;

        for(Map.Entry<Character, Integer> Entry : freq.entrySet()){
            char ch = Entry.getKey();
            int count = Entry.getValue();

            if(vowels.contains(ch)){
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxConsonent = Math.max(maxConsonent, count);
            }
        }

        return maxVowel + maxConsonent;
    }
}