class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int num : nums){
            if((num > 9 && num < 100) || (num > 999 && num < 10000) || (num == 100000)){
                count++;
            }
        }

        return count;
    }
}