import java.util.*;
public class SubArray_Sum_Equals_k {
    // public static int subarraySum(int[] nums, int k){
    //     int n = nums.length;
    //     int ans = 0;
    //     for(int s = 0; s < n; s++){
    //         int sum = 0;

    //         for(int e = s; e < n; e++){
    //             sum += nums[e];
    //             if(sum == k){
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // } Brute Force Approach - O(n^2)

    public static int subarraySum(int[] nums, int k){
        int result = 0; 
        int sum = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(map.containsKey(sum - k)){
                result += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,-1,0};
        int k = 0;
        int subarray = subarraySum(nums, k);
        System.out.println(subarray);
    }
}
