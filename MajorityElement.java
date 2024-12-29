public class MajorityElement {

    // Optimized Approach - O (nlogn)
    // public static int majElement(int[] nums){ 
    //     Arrays.sort(nums);
    //     int freq = 1;
    //     int n = nums.length;
    //     int ans = nums[0];

    //     for(int i = 1; i < n; i++){
    //         if(nums[i] == nums[i - 1]){
    //             freq++;
    //         } else {
    //             freq = 1;
    //             ans = nums[i];
    //         }
    //         if(freq > n / 2){
    //             return ans;
    //         }
    //     }
    //     return ans;
    // }

    // Brute Force Approach - O(n^2)
    // public static int majElement(int[] nums){
    //     int n = nums.length;

    //     for(int num : nums){
    //         int freq = 0;

    //         for(int el : nums){
    //             if(el == num){
    //                 freq++;
    //             }
    //         }
    //         if(freq > n / 2){
    //             return num;
    //         }
    //     }
    //     return -1;
    // }

    // Moore's Voting Algorithm - O(n)
    public static int majElement(int[] nums){
        int freq = 0;
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums= {1, 2, 2, 2, 1};
        int majority = majElement(nums);
        System.out.println(majority);
    }
}
