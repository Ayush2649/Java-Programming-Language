public class isPalindrome_String {
    // public static boolean isPalindrome(String str){
    //     return palindrome(str, 0, str.length() - 1);
    // }

    // public static boolean palindrome(String str, int left, int right){
    //     if(left >= right) return true;

    //     if(str.charAt(left) != str.charAt(right)) return false;

    //     return palindrome(str, left + 1, right - 1);
    // }

    public static void reverse(String str){
        solve(str, 0);
    }

    public static void solve(String str, int idx){
        if(idx >= str.length()) return;
        solve(str, idx + 1);
        System.err.print(str.charAt(idx));
    }

    public static void main(String[] args) {
        // String str = "mada";
        // if(isPalindrome(str)){
        //     System.out.println(str + " is a palindrome");
        // } else {
        //     System.out.println(str + " is not a palindrome");
        // }
        System.out.print("Reversed string is: ");
        String str2 = "hello";
        reverse(str2);
        // System.out.println("Reversed string is: ");
    }
}