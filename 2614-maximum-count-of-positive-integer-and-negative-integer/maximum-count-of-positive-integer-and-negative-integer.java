class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int num : nums){
            if(num > 0){
                pos.add(num);
            } else if(num < 0){
                neg.add(num);
            } else {
                continue;
            }
        }

        if(pos.size() > neg.size()) {
            return pos.size();
        } else if(pos.size() < neg.size()) {
            return neg.size();
        } else {
            return pos.size();
        }
    }
}