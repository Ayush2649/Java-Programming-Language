import java.util.Arrays;
public class Max_Chunks_To_Make_Sorted {
    public static int maxChunksToSorted(int[] arr){
        int n = arr.length;
        int[] prefix = Arrays.copyOf(arr, n);
        int[] suffix = Arrays.copyOf(arr, n);

        for(int i = 1; i < n; i++){
            prefix[i] = Math.max(prefix[i - 1], prefix[i]);
        }

        for(int i = n - 2; i >= 0; i--){
            suffix[i] = Math.min(suffix[i + 1], suffix[i]);
        }

        int chunksCount = 0;
        for(int i = 0; i < n; i++){
            int prefixMax = i > 0 ? prefix[i - 1] : -1;
            int suffixMin = suffix[i];

            if(prefixMax < suffixMin){
                chunksCount++;
            }
        }

        return chunksCount;
    }

    public static void main(String[] args){
        int[] arr = {1, 0, 2, 3, 4};
        System.out.println(maxChunksToSorted(arr));
    }
}
