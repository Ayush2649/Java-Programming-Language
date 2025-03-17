class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int sPointer = 0, tPointer = 0;

        while (tPointer < n){
            if(sPointer < m && s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == m;
    }
}