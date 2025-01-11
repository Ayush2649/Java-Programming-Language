public class Construct_K_Palindrome_Strings {

    // Oddcount
    public static boolean canConstruct(String s, int k){
        if(s.length() < k) return false;
        if(s.length() == k) return true;

        int[] freq = new int[26];
        int oddCount = 0;

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int count : freq){
            if(count % 2 == 1){
                oddCount++;
            }
        }

        return oddCount <= k;
    }

    public static boolean canConstruct2(String s, int k){
        if(s.length() < k) return false;
        if(s.length() == k) return true;

        int oddCount = 0;

        for(char ch : s.toCharArray()){
            oddCount ^= 1 << (ch - 'a');
        }

        return Integer.bitCount(oddCount) <= k;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct2("annabelle", 2)); // true
    }
}
