import java.util.Arrays;
import java.util.*;
public class Permutation_In_String {
    public static boolean isPermutation(String s1, String s2){
        int m = s1.length();
        int n = s2.length();

        if(m > n) return false;

        int s1_freq[] = new int[26];
        int s2_freq[] = new int[26];

        for(int i = 0; i < m; i++){
            s1_freq[s1.charAt(i) - 'a']++;
        }

        int i = 0, j = 0;

        while(j < n){
            s2_freq[s2.charAt(j) - 'a']++;

            if(j - i + 1 > m){
                s2_freq[s2.charAt(i) - 'a']--;
                i++;
            }

            if(Arrays.equals(s1_freq, s2_freq)){
                return true;
            }

            j++;
        }

        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string(s1): ");
        String s1 = scanner.nextLine();

        System.out.println("Enter the second string(s2): ");
        String s2 = scanner.nextLine();

        boolean result = isPermutation(s1, s2);

        if(result){
            System.out.println("Yes, s2 contains a permutation of s1.");
        } else {
            System.out.println("No, s2 does not contain a permutation of s1.");
        }

        scanner.close();
    }
}
