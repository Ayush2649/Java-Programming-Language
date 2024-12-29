public class Best_Sightseeing_Pair {
    public static int maxScoreSightseeingPair(int[] values){
        int n = values.length;

        int first = values[0];
        int maxPairSum = 0;

        for(int j = 1; j < n; ++j){
            int second = values[j] - j;
            maxPairSum = Math.max(maxPairSum, first + second);
            first = Math.max(first, values[j] + j);
        }

        return maxPairSum;
    }

    public static void main(String[] args){
        int[] values = {8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(values));
    }
}
