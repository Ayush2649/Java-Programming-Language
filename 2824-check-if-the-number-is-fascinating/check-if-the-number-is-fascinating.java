class Solution {
    public boolean isFascinating(int n) {
        String s = "" + n + (2 * n) + (3 * n);

        if(s.length() != 9) return false;

        boolean[] seen = new boolean[10];

        for(char c : s.toCharArray()){
            int digit = c - '0';

            if(digit == 0 || seen[digit]) return false;

            seen[digit] = true;
        }

        return true;
    }
}