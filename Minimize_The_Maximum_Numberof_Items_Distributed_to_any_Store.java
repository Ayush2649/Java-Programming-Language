public class Minimize_The_Maximum_Numberof_Items_Distributed_to_any_Store {
    public static boolean canDistribute(int x, int[] quantities, int n){
        int j = 0;
        int remaining = quantities[j];

        for(int i = 0; i < n; i++){
            if(remaining <= x){
                j++;
                if(j == quantities.length){
                    return true;
                } else {
                    remaining = quantities[j];
                }
            } else {
                remaining -= x;
            }
        }
        return false;
    }

    public static int minEatingSpeed(int[] quantities, int n) {
        int low = 0;
        int high = 0;

        for(int quantity : quantities){
            if(quantity > high){
                high = quantity;
            }
        }

        while(low < high){
            int mid = low + (high - low) / 2;
            if(canDistribute(mid, quantities, n)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] quantities = {3, 6, 7, 11};
        int n = 8;
        System.out.println(minEatingSpeed(quantities, n));
    }
}
