class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();

        int[] prefixN = new int[n + 1];
        Arrays.fill(prefixN, 0);

        int[] suffixY = new int[n + 1];
        Arrays.fill(suffixY, 0);

        for(int i = 1; i <= n; i++){
            if(customers.charAt(i - 1) == 'N'){
                prefixN[i] = prefixN[i - 1] + 1;
            } else {
                prefixN[i] = prefixN[i - 1];
            }
        }

        for(int i = n - 1; i >= 0; i--){
            if(customers.charAt(i) == 'Y'){
                suffixY[i] = suffixY[i + 1] + 1;
            } else {
                suffixY[i] = suffixY[i + 1];
            }
        }

        int minPenalty = Integer.MAX_VALUE;
        int minHour = Integer.MAX_VALUE;

        for(int i = 0; i <= n; i++){
            int currPenalty = prefixN[i] + suffixY[i];

            if(currPenalty < minPenalty){
                minPenalty = currPenalty;
                minHour = i;
            } 
        }

        return minHour;
    }
}