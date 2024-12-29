import java.util.*;
import java.util.Arrays;
public class Final_Prices_With_a_Special_Discount_in_a_Shop {
    // public static int[] finalPrices(int[] prices){ // TC : O(n^2) SC : O(1)
    //     int n = prices.length;  
    //     int[] result = prices.clone();

    //     for(int i = 0; i < n; i++){
    //         for(int j = i + 1; j < n; j++){
    //             if(prices[i] >= prices[j]){
    //                 result[i] -= prices[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return result;
    // }

    // Monotonic Stack TC : O(n) SC : O(n)
    public static int[] finalPrices(int[] prices){
        int n = prices.length;
        int[] result = prices.clone();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()]){
                int index = stack.pop();
                result[index] = prices[index] - prices[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] prices = {8,4,6,2,3};
        System.out.println("Input Prices : " + Arrays.toString(prices));
        int[] result = finalPrices(prices);
        System.out.println("Final Prices : " + Arrays.toString(result));
    }
}
