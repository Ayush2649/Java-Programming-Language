class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int num : nums){
            if(String.valueOf(num).length() % 2 == 0){
                count++;
            }
        }

        return count;
    }
}