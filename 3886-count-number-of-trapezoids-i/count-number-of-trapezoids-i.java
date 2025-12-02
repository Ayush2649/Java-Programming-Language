class Solution {
    static final int MOD = (int)1e9 + 7;

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int[] point : points){
            int y = point[1];
            mp.put(y, mp.getOrDefault(y, 0) + 1);
        }    

        long result = 0;
        long prevHorizontalLines = 0;

        for(int count : mp.values()){
            long horizontalLines = (long) count * (count - 1) / 2;

            result = (result + prevHorizontalLines * horizontalLines) % MOD;

            prevHorizontalLines += horizontalLines;
        }

        return (int) (result % MOD);
    }
}