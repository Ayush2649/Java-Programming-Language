class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        for(int i = 0; i < n; i++){
            int lake = rains[i];

            if(lake == 0){
                dryDays.add(i);
            } else {
                ans[i] = -1;

                if(map.containsKey(lake)){
                    Integer dryDay = dryDays.higher(map.get(lake));

                    if(dryDay == null) return new int[0];

                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }

                map.put(lake, i);
            }
        }

        return ans;
    }
}