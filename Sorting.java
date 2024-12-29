public class Sorting{
    public static void Bubblesort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Time Complexity = O (n2) 
    }

    public static void Selectionsort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int minPos = i;
            for(int j = i + 1; j <= arr.length-1; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        // Time Complexity = O (n2) 
    }

    public static void Insertionsort(int arr[]){
        for(int i = 0; i <= arr.length-1; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--; 
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        // Bubblesort(arr);
        // Selectionsort(arr);
        // Insertionsort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        countingSort(arr);
        printArr(arr);
    }
}