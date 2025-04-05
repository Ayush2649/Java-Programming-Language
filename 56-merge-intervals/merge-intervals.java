class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];

            if(curr_start > merged.get(merged.size() - 1)[1]){
                merged.add(intervals[i]);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], curr_end);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}