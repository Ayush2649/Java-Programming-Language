class Solution {
    public int reverse(int n, int rev){
        if(n == 0) return rev;
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverse(n / 10, rev);
    }

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        return x == reverse(x, 0);
    }
}