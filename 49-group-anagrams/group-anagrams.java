class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            int[] count = new int[26];
            for(char ch : str.toCharArray()){
                count[ch - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int c : count){
                keyBuilder.append(c).append('#');
            }

            String key = keyBuilder.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}