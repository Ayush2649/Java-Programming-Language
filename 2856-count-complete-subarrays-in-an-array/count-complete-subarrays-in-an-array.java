class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int unique = set.size();
        int res = 0;
        int i = 0;

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int j = 0; j < n; j++){
            freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);

            while(freqMap.size() == unique){
                res += n - j;

                freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) - 1);
                if(freqMap.get(nums[i]) == 0){
                    freqMap.remove(nums[i]);
                }
                i++;
            }
        }
        return res;
    }
}