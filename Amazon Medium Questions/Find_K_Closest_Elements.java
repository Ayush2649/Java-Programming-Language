// import com.sun.source.util.Plugin;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Find_K_Closest_Elements {
    public static ArrayList<Integer> findClosestElements(int[] arr, int k, int x){
        ArrayList<Integer> res = new ArrayList<>();

        // int left = 0, right = arr.length - k;
        // while(left < right){
        //     int mid = (left + right) / 2;

        //     if(Math.abs(x - arr[mid]) > Math.abs(arr[mid + k] - x)){
        //         left = mid + 1;
        //     } else {
        //         right = mid;
        //     }
        // }

        // for(int i = left; i < left + k; i++){
        //     res.add(arr[i]);
        // }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int a : arr){
            if(k > 0){
                minHeap.offer(a);
                k--;
            } else if(Math.abs(minHeap.peek() - x) > Math.abs(a - x)){
                minHeap.poll();
                minHeap.offer(a);
            }
        }

        while(!minHeap.isEmpty()){
            res.add(minHeap.poll());
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,2,3,4,6,7,8,9,9};
        int k = 4;
        int x = 5;

        ArrayList<Integer> result = findClosestElements(arr, k, x);
        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}
