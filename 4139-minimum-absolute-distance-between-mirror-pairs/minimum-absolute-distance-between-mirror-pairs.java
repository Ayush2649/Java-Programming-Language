class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for(int i = nums.length - 1; i >= 0; i--){
            int rev = rev(nums[i]);

            if(map.containsKey(rev)){
                int j = map.get(rev);
                ans = Math.min(ans, j - i);
            }

            map.put(nums[i], i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int rev(int x){
        int r = 0;
        while(x > 0){
            r = r * 10 + (x % 10);
            x /= 10;
        }

        return r;
    }
}