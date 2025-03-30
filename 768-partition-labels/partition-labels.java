class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> result = new ArrayList<>();

        int[] lastIndex = new int[26];
        for(int i = 0; i < n; i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int i = 0;
        while(i < n){
            int end = lastIndex[s.charAt(i) - 'a'];
            int j = i;
            while(j < end){
                end = Math.max(end, lastIndex[s.charAt(j) - 'a']);
                j++;
            }
            result.add(j - i + 1);
            i = j + 1;
        }

        return result;
    }
}