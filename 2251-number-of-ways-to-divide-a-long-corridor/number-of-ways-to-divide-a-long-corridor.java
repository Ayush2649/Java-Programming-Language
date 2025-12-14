class Solution {
    static final int MOD = 1_000_000_007;
    public int numberOfWays(String corridor) {
        ArrayList<Integer> posSeats = new ArrayList<>();

        for(int i = 0; i < corridor.length(); i++){
            if(corridor.charAt(i) == 'S'){
                posSeats.add(i);
            }
        }

        if(posSeats.size() % 2 != 0 || posSeats.size() == 0) return 0;

        long res = 1;

        for(int i = 2; i < posSeats.size(); i += 2){
            int length = posSeats.get(i) - posSeats.get(i - 1);
            res = (res * length) % MOD;
        }

        return (int) res;
    }
}