import java.util.Arrays;
import java.util.LinkedList;
public class Merge_Intervals {
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> result = new LinkedList<>();

        for(int[] interval : intervals){
            if(result.isEmpty() || result.getLast()[1] < interval[0]){
                result.add(interval);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args){
        int[][] intervals= {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] answer = merge(intervals);
        System.out.println("Merged Intervals : " + Arrays.deepToString(answer));
    }
}
