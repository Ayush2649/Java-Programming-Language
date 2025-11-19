class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        while(set.contains(original)){
            original *= 2;
        }

        return original;
    }
}