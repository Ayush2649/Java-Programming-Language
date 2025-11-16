class Solution {
    static final int MOD = 1_000_000_007;

    public int numSub(String s) {
        long result = 0;
        long count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                count++;
                result = (result + count) % MOD;
            } else {
                count = 0;
            }
        }

        return (int) result;
    }
}