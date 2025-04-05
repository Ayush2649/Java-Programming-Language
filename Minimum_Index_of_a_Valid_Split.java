import java.util.*;
import java.util.Arrays;
public class Minimum_Index_of_a_Valid_Split {
    public static int minimumIndex(ArrayList<Integer> nums){
        int n = nums.size();

        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();

        for(int num : nums){
            mp2.put(num, mp2.getOrDefault(num, 0) + 1);
        }

        for(int i = 0; i < n; i++){
            int num = nums.get(i);

            mp1.put(num, mp1.getOrDefault(num, 0) + 1);
            mp2.put(num, mp2.get(num) - 1);

            int n1 = i + 1;
            int n2 = n - i - 1;

            if(mp1.get(num) * 2 > n1 && mp2.get(num) > n2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 2, 2));
        System.err.println(minimumIndex(nums));
    }
}
