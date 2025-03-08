public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static int minimumRecolours(String blocks, int k){
        int n = blocks.length();

        int minOperations = 0;

        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                minOperations++;
            }
        }

        int currentOpreations = minOperations;

        for(int i = k; i < n; i++){
            if(blocks.charAt(i - k) == 'W') {
                currentOpreations--;
            }

            if(blocks.charAt(i) == 'W') {
                currentOpreations++;
            }

            minOperations = Math.min(minOperations, currentOpreations);
        }

        return minOperations;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolours(blocks, k));
    }
}
