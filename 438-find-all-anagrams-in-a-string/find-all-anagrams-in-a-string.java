class Solution {
    private boolean allZero(int[] count) {
        for(int num : count){
            if(num != 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String txt, String pat) {
        int k = pat.length();
        int[] count = new int[26];
        Arrays.fill(count, 0);

        for(char ch : pat.toCharArray()) {
            count[ch - 'a']++;
        }

        int i = 0, j = 0;
        int n = txt.length();
        ArrayList<Integer> result = new ArrayList<>();

        while(j < n){
            int idx = txt.charAt(j) - 'a';
            count[idx]--;

            if(j - i + 1 == k){
                if(allZero(count)){
                    result.add(i);
                }
                count[txt.charAt(i) - 'a']++;
                i++; 
            } 
            j++;
        }
        return result;
    }
}