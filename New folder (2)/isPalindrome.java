class isPalindrome{
    public static int reverse (int n, int rev){
        if(n == 0){
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return reverse(n / 10, rev);
    }

    public static boolean Palindrome(int n){
        if(n < 0) return false;
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        int n = 123;
        if(Palindrome(n)){
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }
}