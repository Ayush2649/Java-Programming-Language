public class Final_Array_State_After_K_Multiplication_Operations_I {
    public static int[] getFinalState(int[] nums, int k, int multiplier){

        int n = nums.length;
        
        for(int j = 0; j < k; j++){
            int idx = 0;

            for(int i = 0; i < n; i++){
                if(nums[i] < nums[idx]){
                    idx = i;
                }
            }

            nums[idx] *= multiplier;
        }
        return nums;
    }

    public static void main(String[] args){
        int nums[] = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;

        int result[] = getFinalState(nums, k, multiplier);

        System.out.println("The final state aafter k operations is: ");
        for(int num: result){
            System.out.print(num + " ");
        }
    }
}
