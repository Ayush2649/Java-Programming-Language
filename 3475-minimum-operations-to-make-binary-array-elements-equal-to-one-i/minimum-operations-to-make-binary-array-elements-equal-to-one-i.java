class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int k = 3;

        int flips = 0;
        int flipCountFromPastForCurri = 0;

        for(int i = 0; i < n; i++){
            if(i >= k && nums[i - k] == 5){
                flipCountFromPastForCurri--;
            }

            if(flipCountFromPastForCurri % 2 == nums[i]){
                if(i + k > n) return -1;
                flipCountFromPastForCurri++;
                flips++;
                nums[i] = 5;
            }
        }
        return flips;
    }
}