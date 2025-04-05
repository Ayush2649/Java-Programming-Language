class Solution {
    
    void merge(int arr[], int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        int k = l;
        
        for(int i = 0; i <= n1; i++) L[i] = arr[k++];
        for(int j = 0; j <= n2; j++) R[j] = arr[k++];
        
        int i = 0; 
        int j = 0;
        k = l;
        
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        
        while(j < n2){
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l <= r) return;
        
        int mid = l + (r - l) / 2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        
        merge(arr, l, mid, r);
    }
}
