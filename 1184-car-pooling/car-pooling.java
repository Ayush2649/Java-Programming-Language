class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] possibility = new int[1001];

        for(int[] a : trips){
            possibility[a[1]] += a[0];
            possibility[a[2]] -= a[0];
        }

        for(int i = 0; i < 1001 && capacity >= 0; i++){
            capacity -= possibility[i];
        }

        return capacity >= 0 ? true : false;
    }
}