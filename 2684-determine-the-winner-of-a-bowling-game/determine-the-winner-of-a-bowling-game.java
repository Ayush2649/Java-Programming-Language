class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1 = score(player1);
        int sum2 = score(player2);

        if(sum1 > sum2) return 1;
        if(sum2 > sum1) return 2;
        return 0;
    }

    private int score(int[] p){
        int sum = 0;

        for(int i = 0; i < p.length; i++){
            int val = p[i];

            if((i > 0 && p[i - 1] == 10) || (i > 1 && p[i - 2] == 10)){
                val *= 2;
            }

            sum += val;
        }

        return sum;
    }
}