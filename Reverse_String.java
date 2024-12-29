public class Reverse_String{
    public static void reverse(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args){
        char[] str = {'H', 'e', 'l', 'l', 'o'};
        reverse(str);
        System.out.println(str);
    }
}