public class Maximum_Score_After_Splitting_a_String {
    // public static int maxScore(String s){
    //     int n = s.length();
    //     int result = Integer.MIN_VALUE;
    //     int totalOnes = (int) s.chars().filter(ch -> ch == '1').count();

    //     int zeroes = 0;

    //     for(int i = 0; i < n - 1; i++){
    //         if(s.charAt(i) == '0'){
    //             zeroes++;
    //         } else {
    //             totalOnes--;
    //         }
    //         result = Math.max(result, zeroes + totalOnes);
    //     }
    //     return result;
    // }

    public static int maxScore(String s){
        int n = s.length();
        int result = Integer.MIN_VALUE;
        
        int zeroes = 0;
        int ones = 0;

        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == '0'){
                zeroes++;
            } else {
                ones++;
            }
            result = Math.max(result, zeroes - ones);
        }
         
        if(s.charAt(n - 1) == '1'){
            ones++;
        }

        return result + ones;
    }

    public static void main(String[] args){
        String s = "011101";
        System.out.println(maxScore(s));
    }
}
