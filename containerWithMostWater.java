public class containerWithMostWater {
    public static int maxAreaBrute(int[] height){
        int n = height.length;
        int maxWater = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int width = j - i;
                int ht = Math.min(height[i], height[j]);
                maxWater = Math.max(maxWater, width * ht);
            }
        }
        return maxWater;
    } //Brute Force Approach - O(n^2)

    public static int maxAreaOptimal(int[] height){
        int maxWater = 0;
        int n = height.length;
        int left = 0; 
        int right = n - 1;

        while(left < right){
            int width = right - left;
            int ht= Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, width * ht);
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            } 
        }
        return maxWater;
    } // Optimal Approach - O(n)

    public static void main(String[] args){
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxAreaOptimal(height);
        System.out.println("Maximum water = " + maxArea);
    }
}
