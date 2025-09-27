class Solution {
    public double area(int[] P, int[] Q, int[] R){
        return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
                            - Q[0]*P[1] - R[0]*Q[1] - R[1]*P[0]);
    }

    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
                }
            }
        }

        return ans;
    }
}