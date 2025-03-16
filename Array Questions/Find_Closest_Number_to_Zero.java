public class Find_Closest_Number_to_Zero{ // Q1 Find Closest Number to Zero(Easy) - 3/10
    public static int findClosestToZero(int[] nums){
        int n = nums.length;
        int res = nums[0];
        int m = Math.abs(res);
        
        for(int i = 0; i < n; i++){
            int d = Math.abs(nums[i]);
            if(d < m || d == m && nums[i] > res){
                m = d;
                res = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};
        System.out.println(findClosestToZero(nums)); // Output: 1
    }
}