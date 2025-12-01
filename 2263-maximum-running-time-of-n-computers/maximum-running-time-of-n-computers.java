class Solution {

    public boolean possible(int[] batteries, long mid, int n){
        long target = n * mid;

        for(int i = 0; i < batteries.length; i++){
            target -= Math.min(batteries[i], mid);

            if(target <= 0) return true;
        }

        return false;
    }

    public long maxRunTime(int n, int[] batteries) {
        long l = 1;
        for(int num : batteries){
            l = Math.min(num, l);
        }

        long sum = 0;
        for(int num : batteries){
            sum += num;
        }

        long r = sum / n;

        long result = 0;

        while(l <= r){
            long mid = l + (r - l) / 2;

            if(possible(batteries, mid, n)){
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }
}