import java.util.*;
public class Sliding_Window_Maximum {
    public static int[] maxSlidingWindow(int[] nums, int k){
        ArrayDeque<Integer> q =new ArrayDeque<>();
        int i = 0, j = 0, ptr = 0;
        int n = nums.length;
        int res[] = new int[n - k + 1];

        while(j < n){
            while(!q.isEmpty() && q.peekLast() < nums[j]){
                q.pollLast();
            }

            q.add(nums[j]);

            if(j - i + 1 < k){
                j++;
            } else if(j - i + 1 == k){
                res[ptr++] = q.peek();

                if(nums[i] == q.peek()){
                    q.pollFirst();
                }
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);

        System.out.println("Maximums of each sliding window:");
        for (int max : ans) {
            System.out.print(max + " ");
        }
    }
}
