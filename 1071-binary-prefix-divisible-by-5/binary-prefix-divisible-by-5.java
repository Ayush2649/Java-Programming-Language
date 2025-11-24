class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int mod = 0;

        for(int bit : nums){
            mod = (mod * 2 + bit) % 5;
            ans.add(mod == 0);
        }

        return ans;
    }
}