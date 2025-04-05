class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> numToIndex = new HashMap<>(); 

        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if(numToIndex.containsKey(complement)){
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}