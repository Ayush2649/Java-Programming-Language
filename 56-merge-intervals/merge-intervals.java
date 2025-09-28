class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];

            if(curr_start > ans.get(ans.size() - 1)[1]){
                ans.add(intervals[i]);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(curr_end, ans.get(ans.size() - 1)[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}