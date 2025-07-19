class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();

        int[] leftClosestR = new int[n];
        int[] rightClosestL = new int[n];

        // Move from n - 1 to 0 for rightClosestL
        for(int i = n - 1; i >= 0; i--){
            if(dominoes.charAt(i) == 'L'){
                rightClosestL[i] = i;
            } else if (dominoes.charAt(i) == '.'){
                rightClosestL[i] = i < n - 1 ? rightClosestL[i + 1] : -1;
            } else {
                rightClosestL[i] = -1;
            }
        }

        // Move from 0 to n - 1 for leftClosestR
        for(int i = 0; i < n; i++){
            if(dominoes.charAt(i) == 'R'){
                leftClosestR[i] = i;
            } else if (dominoes.charAt(i) == '.'){
                leftClosestR[i] = i > 0 ? leftClosestR[i - 1] : -1;
            } else {
                leftClosestR[i] = -1;
            }           
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            int distRightL = Math.abs(i - rightClosestL[i]);
            int distLeftR = Math.abs(i - leftClosestR[i]);

            if(leftClosestR[i] == rightClosestL[i]){
                sb.append('.');
            } else if (leftClosestR[i] == -1){
                sb.append('L');
            } else if (rightClosestL[i] == -1){
                sb.append('R');
            } else if (distRightL == distLeftR){
                sb.append('.');
            } else {
                sb.append(distRightL < distLeftR ? 'L' : 'R');
            }
        }

        return sb.toString();
    }
}