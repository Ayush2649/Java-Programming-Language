public class Merge_Strings_Alternately { // Q2. Merge Strings Alternately - 4/10
    public static String mergeStrings(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Math.max(m, n); i++){
            if(i < m) sb.append(s1.charAt(i));
            if(i < n) sb.append(s2.charAt(i));
        }

        return sb.toString();
    }    

    public static void main(String[] args) {
        System.out.println(mergeStrings("abc", "pqr"));  // Output: apb
    }
}
