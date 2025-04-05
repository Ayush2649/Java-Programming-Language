class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();

        int minOperations = 0;

        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                minOperations++;
            }
        }

        int currentOperations = minOperations;
        for(int i = k; i < n; i++){
            if(blocks.charAt(i - k) == 'W'){
                currentOperations--;
            }

            if(blocks.charAt(i) == 'W'){
                currentOperations++;
            }

            minOperations = Math.min(currentOperations, minOperations);
        }

        return minOperations;
    }
}