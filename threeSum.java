import java.util.*;
import java.util.Arrays;
public class threeSum {

    public static void twoSum(int[] nums, int k, List<List<Integer>> result, int target){
        int i = k;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] < target){
                i++;
            } else if(nums[i] + nums[j] > target){
                j--;
            } else {
                result.add(Arrays.asList(-target, nums[i], nums[j]));
                while(i < j && nums[i] == nums[i + 1]){
                    i++;
                }
                while(i < j && nums[j] == nums[j - 1]){
                    j--;
                }
                i++;
                j--;
            }
        }
    }

    public static List<List<Integer>> Sum(int[] nums){
        if(nums.length < 3){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            twoSum(nums, i + 1, result, -nums[i]);
        }
        return result;
    }

    public static void main(String[] args){
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> targetSum = Sum(nums);
        System.out.println(targetSum);
    }
}
