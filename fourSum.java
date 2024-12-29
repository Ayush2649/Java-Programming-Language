import java.util.*;
import java.util.Arrays;
public class fourSum {
    
    public static List<List<Integer>> sum(int[] nums, int target){
        if(nums.length < 4){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int a = 0; a < nums.length - 3; a++){
            if(a > 0 && nums[a] == nums[a - 1]){
                continue;
            } 
            for(int b = a + 1; b < nums.length - 2; b++){
                if(b > a + 1 && nums[b] == nums[b - 1]){
                    continue;
                }
                int left = b + 1;
                int right = nums.length - 1;

                while(left < right){
                    int sum = nums[a] + nums[b] + nums[left] + nums[right];
                    if(sum < target){
                        left++;
                    } else if(sum > target){
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[a], nums[b], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        } 
                        while(left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> quadruplets = sum(nums, target);
        System.out.println("The Quadruplets for the target" + target + ": " + quadruplets); 
    }
}
