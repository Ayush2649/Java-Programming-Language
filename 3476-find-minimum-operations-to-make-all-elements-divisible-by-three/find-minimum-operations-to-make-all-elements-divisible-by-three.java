class Solution {
    public int minimumOperations(int[] nums) {
        int ops = 0;
        for(int num : nums){
            if(num % 3 != 0) ops++;
        }

        return ops;
    }
}