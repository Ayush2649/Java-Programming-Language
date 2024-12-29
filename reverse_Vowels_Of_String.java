public class reverse_Vowels_Of_String {
    public static String reverseVowels(String s){
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while(start < end){
            while(start < end && vowels.indexOf(word[start]) == -1){
                start++;
            }
            while(start < end && vowels.indexOf(word[end]) == -1){
                end--;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }

        String ans = new String(word);
        return ans;
    }

    public static void main(String[] args){
        String s = "Hello";
        String reverseVowel = reverseVowels(s);
        System.out.println("Reversed String : " + reverseVowel);
    }
} // Two Pointer Approach - O(n)
