import java.util.Arrays;
public class Product_of_Array_Except_Self {
    
    // public static int[] productExceptSelf(int[] nums){
    //     int n = nums.length;
    //     int[] ans = new int[n];
    //     Arrays.fill(ans, 1);
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //             if(i != j){
    //             ans[i] *= nums[j];
    //             }
    //         }
    //     }
    //     return ans;
    // } Brute Force Approach - TC - O(n^2)

    // public static int[] productExceptSelf(int[] nums){
    //     int n = nums.length;
    //     int[] ans = new int[n];
    //     int[] prefix = new int[n];
    //     int[] suffix = new int[n];

    //     Arrays.fill(ans, 1);
    //     Arrays.fill(prefix, 1);
    //     Arrays.fill(suffix, 1);

    //     // Prefix
    //     for(int i = 1; i < n; i++){
    //         prefix[i] = prefix[i - 1] * nums[i - 1];
    //     }

    //     // Suffix
    //     for(int i = n - 2; i >= 0; i--){
    //         suffix[i] = suffix[i + 1] * nums[i + 1];
    //     }

    //     for(int i = 0; i < n; i++){
    //         ans[i] = prefix[i] * suffix[i];
    //     }

    //     return ans;
    // } TC - O(n) SC - O(n)

    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        for(int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    } // TC - O(n) SC - O(1)

    public static void printArray(int[] nums){
        for(int val : nums){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.println("Original Array : ");
        printArray(nums);

        System.out.println("Array after Product : ");
        printArray(result);
    }
}
