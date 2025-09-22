class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(map.values());

        int count = 0;
        for(int val : map.values()){
            if(val == maxFreq){
                count += val;
            }
        }

        return count;
    }
}