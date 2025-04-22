
import java.util.PriorityQueue;

public class Kth_Largest_Element_In_an_Array {
    public static int kthLargest(int[] arr, int k){
        // int n = arr.length;

        // Arrays.sort(arr);

        // return arr[n - k];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int a : arr){
            minHeap.offer(a);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = kthLargest(arr, k);
        System.out.println(result); // Output: 5
    }
}
