public class Valid_Anagram {
    // public static boolean isAnagram(String s1, String s2){  // O(nlogn)
    //     char[] arr1 = s1.toCharArray();
    //     char[] arr2 = s2.toCharArray();

    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);

    //     return Arrays.equals(arr1, arr2);
    // }    

    public static boolean isAnagram(String s, String t){ // O(n)
        int m = s.length();
        int n = t.length();

        if(m != n){
            return false;
        }

        int count[] = new int[26];

        for(int i = 0; i < m; i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < n; i++){
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "alert";
        String s2 = "later";

        if(isAnagram(s1, s2)){
            System.out.println(s1 + " and " + s2 + " " + "are Angarams");
        } else {
            System.out.println(s1 + " and " + s2 + " " + "are not Angarams");
        }
    }
}
