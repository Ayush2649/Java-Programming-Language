import java.util.*;
public class largest_Rectangle_In_a_Histogram {
    // public static int largestRectangle(int[] heights){ Brute Force Approach - O(n*n)
    //     int n = heights.length;
    //     int maxArea = 0;

    //     for(int i = 0; i < n; i++){
    //         int minHeight = Integer.MAX_VALUE;
    //         for(int j = i; j < n; j++){
    //             minHeight = Math.min(minHeight, heights[j]);
    //             maxArea = Math.max(maxArea, minHeight * (j - i + 1));
    //         }
    //     }
    //     return maxArea;
    // }

    public static int largestRectangle(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                leftSmall[i] = 0;
            } else {
                leftSmall[i] = st.peek() + 1;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            st.pop();
        }

        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                rightSmall[i] = n - 1;
            } else {
                rightSmall[i] = st.peek() - 1;
            }
            st.push(i);
        }

        int maxA = 0;
        for(int i = 0; i < n; i++){ 
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;
    }

    public static void main(String[] args){
        int arr[] = {2, 1, 5, 6, 2, 3, 1};
        System.out.println("The largest area in the histogram is " + largestRectangle(arr));
    }
}
