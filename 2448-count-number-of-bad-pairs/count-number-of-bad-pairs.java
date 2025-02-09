class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long result = 0;

        for(int i = 0; i < n; i++){
            nums[i] = nums[i] - i;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);

        for(int j = 1; j < n; j++){
            int countOfNumsJ = map.getOrDefault(nums[j], 0);
            int totalNumsBeforeJ = j;
            int badPairs = totalNumsBeforeJ - countOfNumsJ;
            result += badPairs;

            map.put(nums[j], countOfNumsJ + 1);
        }

        return result;
    }
}