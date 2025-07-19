import java.util.TreeMap;

public class Meeting_Rooms_II {
    public int minConfRooms(int[][] intervals){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = 0, cnt = 0;

        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);
        }

        for(int k : map.keySet()){
            cnt += map.get(k);
            ans = Math.max(ans, cnt);
        }

        return ans;
    }    

    public static void main(String[] args) {
        Meeting_Rooms_II m = new Meeting_Rooms_II();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(m.minConfRooms(intervals)); // Output: 2
    }
}
