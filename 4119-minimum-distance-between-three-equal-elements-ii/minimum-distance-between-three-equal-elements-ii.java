class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int v = nums[i];

            if(!map.containsKey(v)){
                map.put(v, new int[] {i, -1});
            } else {
                int[] t = map.get(v);
                if(t[1] != -1) ans = Math.min(ans, 2 * (i - t[0]));
                map.put(v, new int[] {t[1] == -1 ? t[0] : t[1], i});
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}