import java.util.Arrays;
public class Next_Permutation {
    public static void nextPermut(int[] nums){
        int n = nums.length;

        int i = n - 1;
        while(i > 0 && nums[i - 1] > nums[i]){
            i--;
        }

        if(i != 0){
            int index = i;
            for(int j = n - 1; j >= i; j--){
                if(nums[j] > nums[i - 1]){
                    index = j;
                    break;
                }
            }
            swap(nums, i - 1, index);
        }
        
        reverse(nums, i, n - 1);
    }

    public static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 1};
        nextPermut(nums);
        System.out.println(Arrays.toString(nums));
    }
}
