class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        merged.add(prev);

        for(int[] interval: intervals){
            if(interval[0] > prev[1]){
                merged.add(interval);
                prev = interval;
            } else {
                prev[1] = Math.max(prev[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]); 
    }
}