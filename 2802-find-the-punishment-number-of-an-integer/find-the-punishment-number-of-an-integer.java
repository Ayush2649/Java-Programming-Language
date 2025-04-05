class Solution {
    public boolean check(int i, int currSum, String s, int num, int[][] t){
        if(i == s.length()){
            return currSum == num;
        }

        if(currSum > num){
            return false;
        }

        if(t[i][currSum] != -1){
            return t[i][currSum] == 1;
        }

        boolean possible = false;
        for(int j = i; j < s.length(); j++){
            String currentString = s.substring(i, j + 1);
            int val = Integer.parseInt(currentString);

            possible = possible || check(j + 1, currSum + val, s, num, t);

            if(possible){
                t[i][currSum] = 1;
                return true;
            }
        }

        t[i][currSum] = 0;
        return false;
    }

    public int punishmentNumber(int n) {
        int punish = 0;

        for(int num = 1; num <= n; num++){
            int sq = num * num;
            String s = Integer.toString(sq);

            int[][] t = new int[s.length()][num + 1];
            for(int[] row : t){
                Arrays.fill(row, -1);
            }

            if(check(0, 0, s, num,  t) == true){
                punish += sq;
            }
        } 
        return punish;
    }
}