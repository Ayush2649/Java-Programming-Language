class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, int[]> xtoMinMaxY = new HashMap<>();
        Map<Integer, int[]> ytoMinMaxX = new HashMap<>(); 

        for(int[] building: buildings){
            int x = building[0];
            int y = building[1];

            xtoMinMaxY.putIfAbsent(x, new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE});
            ytoMinMaxX.putIfAbsent(y, new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE});

            int[] xr = ytoMinMaxX.get(y);
            xr[0] = Math.min(xr[0], x);
            xr[1] = Math.max(xr[1], x);

            int[] yr = xtoMinMaxY.get(x);
            yr[0] = Math.min(yr[0], y);
            yr[1] = Math.max(yr[1], y);
        }

        int res = 0;

        for(int[] building: buildings){
            int x = building[0];
            int y = building[1];

            int[] xr = ytoMinMaxX.get(y);
            int[] yr = xtoMinMaxY.get(x);

            if(xr[0] < x && x < xr[1] &&
               yr[0] < y && y < yr[1]){
                res++;
            } 
        }

        return res;
    }
}