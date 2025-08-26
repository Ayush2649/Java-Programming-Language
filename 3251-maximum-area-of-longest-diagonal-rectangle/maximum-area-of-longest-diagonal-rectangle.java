class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;

        for(int[] rect : dimensions){
            int len = rect[0];
            int width = rect[1];

            double diagonal = Math.sqrt(len * len + width * width);
            int area = len * width;

            if(diagonal > maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            } else if(diagonal == maxDiagonal && area > maxArea){
                maxArea = area;
            }
        }

        return maxArea;
    }
}