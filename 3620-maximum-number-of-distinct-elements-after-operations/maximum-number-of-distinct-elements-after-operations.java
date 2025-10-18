class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long nextFree = Long.MIN_VALUE;
        int distinctCount = 0;

        for(int num : nums){
            long low = num - k;
            long high = num + k;

            long assign = Math.max(low, nextFree);

            if(assign <= high){
                distinctCount++;
                nextFree = assign + 1;
            }
        }

        return distinctCount;
    }
}