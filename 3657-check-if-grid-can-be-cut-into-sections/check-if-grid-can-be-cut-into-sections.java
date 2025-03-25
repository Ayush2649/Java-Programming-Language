class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int curr_start = intervals[i][0];
            int curr_end = intervals[i][1];

            if(curr_start >= merged.get(merged.size() - 1)[1]){
                merged.add(intervals[i]);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], curr_end);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        ArrayList<int[]> hor = new ArrayList<>();
        ArrayList<int[]> vert = new ArrayList<>();

        for(int[] coord : rectangles){
            int x1 = coord[0];
            int y1 = coord[1];
            int x2 = coord[2];
            int y2 = coord[3];

            hor.add(new int[] {x1, x2});
            vert.add(new int[] {y1, y2});
        }

        int[][] horArray = hor.toArray(new int[hor.size()][]);
        int[][] vertArray = vert.toArray(new int[vert.size()][]);

        int[][] result1 = merge(horArray);
        if(result1.length >= 3) return true;

        int[][] result2 = merge(vertArray);
        return result2.length >= 3;
    }
}