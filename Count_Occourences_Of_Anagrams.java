import java.util.Arrays;
public class Count_Occourences_Of_Anagrams {
    private static boolean allZeros(int[] count) {
        for(int num : count) {
            if(num != 0){
                return false;
            }
        }
        return true;
    }

    public static int search(String pat, String txt){
        int k = pat.length();
        int[] count = new int[26];
        Arrays.fill(count, 0);

        for(char ch : pat.toCharArray()){
            count[ch - 'a']++;
        }

        int i = 0, j = 0;
        int n = txt.length();
        int result = 0;

        while(j < n) {
            int idx = txt.charAt(j) - 'a';
            count[idx]--;

            if(j - i + 1 == k){
                if(allZeros(count)){
                    result++;
                }
                count[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println(search(pat, txt));
    }
}
