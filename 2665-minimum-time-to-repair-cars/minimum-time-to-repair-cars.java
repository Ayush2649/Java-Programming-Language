class Solution {
    public boolean isPossible(int[] ranks, long mid, int cars){
        long carsRepaired = 0;

        for(int rank : ranks){
            carsRepaired += (long) Math.sqrt(1.0 * mid / (double) rank); 
        }

        return carsRepaired >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long r = 1L * cars * cars * Arrays.stream(ranks).max().orElse(0);

        while(l <= r){
            long mid = l + (r - l) / 2;

            if(isPossible(ranks, mid, cars)){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}