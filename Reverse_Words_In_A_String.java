public class Reverse_Words_In_A_String {

    // public static String reverseWords(String s){
    //     String[] words = s.split(" ");
    //     int left = 0;
    //     int right = words.length - 1;

    //     while(left < right){
    //         String temp = words[left];
    //         words[left] = words[right];
    //         words[right] = temp;
    //         left++;
    //         right--;
    //     }

    //     StringBuilder result = new StringBuilder();

    //     for(String word : words){
    //         if(!word.isEmpty()){
    //             if(result.length() > 0){
    //                 result.append(" ");
    //             }
    //             result.append(word);
    //         }
    //     }
    //     return result.toString();
    // }

    public static String reverseWords(String s){
        String words[] = s.split(" +");

        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args){
        String s = "The Sky is Blue";
        String reverseWord = reverseWords(s);
        System.out.println(reverseWord);
    }
}
