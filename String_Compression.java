public class String_Compression {
    public static int compress(char[] chars){
        int n = chars.length;
        int idx = 0;

        for(int i = 0; i < n;){
            char ch = chars[i];
            int count = 0;

            while(i < n && chars[i] == ch){
                count++;
                i++;
            }

            chars[idx++] = ch;
            if(count > 1){
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[idx++] = digit;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args){
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int size = compress(chars);
        System.out.println(size);
    }
}
