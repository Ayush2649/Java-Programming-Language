public class Arrays_Questions{
    public static boolean containsDuplicate(int nums[]) {
        for(int i=0; i<nums.length-1 ; i++) {
             for(int j=i+1; j<nums.length ; j++ ) { 
                if( nums[i] == nums[j] ) {
                return true ;
                }
            }
        } 
        return false; 
    }

    // public static int trappedWater(int height[]){
    //     int n = height.length;
    //     int[] leftMax = new int[n];
    //     leftMax[0] = height[0];
    //     for(int i = 1; i < n; i++){
    //         leftMax = Math.max(height[i], leftMax[i-1]);
    //     }

    //     int[] rightMax = new int[n];
    //     rightMax[n-1] = height[n-1];
    //     for(int i = n-2; i >= 0; i--){
    //         rightMax = Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trappwater = 0;
    //     for(int i = 0; i < n; i++){
    //         int waterlevel = Math.min(leftMax[i], rightMax[i]);
    //         trappwater += waterlevel - height[i];
    //     }
    //     return trappwater;
    // }

    public static int trappedWater(int height[]) {
    int n = height.length;
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];

    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int trappwater = 0;
    for (int i = 0; i < n; i++) {
        int waterlevel = Math.min(leftMax[i], rightMax[i]);
        trappwater += waterlevel - height[i];
    }
    return trappwater;
}


public static void main(String args[]){
    // int nums[] = {1, 2, 3, 4, 1}; 
    // int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
    int height[] = {4, 2, 0, 3, 2, 5};
    // System.out.println(containsDuplicate(nums));
    System.out.println(trappedWater(height));
}
}       