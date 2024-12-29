public class Remove_All_Occourrences_Of_A_Substring {
    public static String removeOccourrences(String s, String part){
        int idx = s.indexOf(part);

        if(idx == -1){
            return s;
        }

        return removeOccourrences(s.substring(0, idx) + s.substring(idx + part.length(), s.length()), part);
    }

    public static void main(String[] args){
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccourrences(s, part));
    }
}
