
import java.util.Arrays;
import java.util.Comparator;

public class fractional_KnapSack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;

        double[][] ratio = new double[values.length][2];
        
        for(int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double) weights[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        double maxValue = 0.0;

        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if(capacity >= weights[idx]){
                maxValue += values[idx];
                capacity -= weights[idx];
            } else {
                maxValue += ratio[i][1] * capacity;
                break; 
            }
        }

        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
