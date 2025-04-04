class Solution {
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        Map<Character, Integer> map = new HashMap<>();

        int[] nextCons = new int[n];
        int lastCons = n;
        for(int i = n - 1; i >= 0; i--){
            nextCons[i] = lastCons;
            if(!isVowel(word.charAt(i))){
                lastCons = i;
            }
        }    

        int i = 0, j = 0;
        long count = 0;
        int cons = 0;
        
        while(j < n) {
            char ch = word.charAt(j);
            if(isVowel(ch)){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            } else {
                cons++;
            }

            while(cons > k){
                char ci = word.charAt(i);
                if(isVowel(ci)) {
                    map.put(ci, map.get(ci) - 1);
                    if(map.get(ci) == 0){
                        map.remove(ci);
                    }
                }else {
                    cons--;
                }
                i++;
            }

            while(i <= j && map.size() == 5 && cons == k) {
                int idx = nextCons[j];
                count += idx - j;

                char ci = word.charAt(i);
                if(isVowel(ci)) {
                    map.put(ci, map.get(ci) - 1);
                    if(map.get(ci) == 0){
                        map.remove(ci);
                    }
                }else {
                    cons--;
                }
                i++;
            }
            j++;
        }
        return count;
    }
}