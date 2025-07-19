class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;

        // 1. Find Pivot
        int pivot = -1;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }

        // 2. If not found reverse the arr
        if(pivot == -1){
            reverse(arr, 0, n - 1);
            return;
        } 

        // 3. Swap the pivot with the next greater element in right
        for(int i = n - 1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot);
                break;
            }
        }

        // 4. reversee from pivot + 1 to n - 1
        reverse(arr, pivot + 1, n - 1);
    }

    private void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start++, end--);
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}