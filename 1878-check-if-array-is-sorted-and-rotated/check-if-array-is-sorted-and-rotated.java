class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        for(int rotatedOffset = 0; rotatedOffset < n; rotatedOffset++){
            boolean isMatch = true;
            for(int i = 0; i < n; i++){
                if(nums[(rotatedOffset + i) % n] != sortedNums[i]){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) return true;
        }
        return false;
    }
}