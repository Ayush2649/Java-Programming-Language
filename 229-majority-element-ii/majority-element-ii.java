class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > n/3){
                res.add(entry.getKey());
            }
        }

        return res;
    }
}