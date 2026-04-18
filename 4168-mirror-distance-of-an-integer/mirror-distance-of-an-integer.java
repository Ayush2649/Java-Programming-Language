class Solution {
    public int mirrorDistance(int n) {
        int rev = 0, x = n;

        while(x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return Math.abs(n - rev);
    }
}