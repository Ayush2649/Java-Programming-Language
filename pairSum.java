import java.util.*;

public class pairSum {

    // Two Pointer Approach
    // public static void pairs(int[] nums, int target){ O(n)
    //     int n = nums.length;
    //     int[] ans = new int[n];

    //     int i = 0;
    //     int j = n - 1;

    //     while(i < j){
    //         int pairSum = nums[i] + nums[j];
    //         if(pairSum == target){
    //             System.out.println("Pair Found : (" + nums[i] + "," + nums[j] + ")");
    //             i++;
    //             j--;
    //         } else if(pairSum < target){
    //             i++;
    //         } else {
    //             j--;
    //         }
    //     }
    // }

    
    public static void pairs(int[] nums, int target){ // O(n)
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            int complement = target - num;

            if(map.containsKey(complement)){
                System.out.println("Pair Found : (" + complement + "," + num + ")");
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public static void main(String[] args){
        int nums[] = {1, 2, 3, 4, 5};
        int target = 6;

        pairs(nums, target);
    }
}
