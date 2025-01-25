import java.util.*;
import java.util.Arrays;

public class Make_Lexicographically_Smallest_Array_by_Swapping_Elements{
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] vec = nums.clone();
        Arrays.sort(vec);

        int groupNum = 0;
        Map<Integer, Integer> numToGroup = new HashMap<>();
        Map<Integer, LinkedList<Integer>> groupToList = new HashMap<>();

        numToGroup.put(vec[0], groupNum);
        groupToList.putIfAbsent(groupNum, new LinkedList<>());
        groupToList.get(groupNum).add(vec[0]);

        for (int i = 1; i < n; i++) {
            if (Math.abs(vec[i] - vec[i - 1]) > limit) {
                groupNum++;
            }
            numToGroup.put(vec[i], groupNum);
            groupToList.putIfAbsent(groupNum, new LinkedList<>());
            groupToList.get(groupNum).add(vec[i]);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            result[i] = groupToList.get(group).pollFirst(); // Use and remove the smallest element
        }

        return result;
    }

    public static void main(String[] args) {
        Make_Lexicographically_Smallest_Array_by_Swapping_Elements obj = new Make_Lexicographically_Smallest_Array_by_Swapping_Elements();

        int[] nums = {1, 5, 3, 9, 8};
        int limit = 2;

        int[] result = obj.lexicographicallySmallestArray(nums, limit);

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Lexicographically smallest array: " + Arrays.toString(result));
    }
}
