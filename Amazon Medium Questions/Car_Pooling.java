public class Car_Pooling { // O(n + m) n = trips m = m array(1001)
    public static boolean carPool(int[][] trips, int capacity){
        int[] m = new int[1001];

        for(int[] a : trips){
            m[a[1]] += a[0];
            m[a[2]] -= a[0];
        }

        for(int i = 0; i < 1001 && capacity >= 0; i++){
            capacity -= m[i];
        }

        return capacity >= 0;
    }

    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        System.out.println(carPool(trips, capacity)); // Output: false

        int[][] trips2 = {{2, 1, 5}, {3, 3, 7}};
        int capacity2 = 5;
        System.out.println(carPool(trips2, capacity2)); // Output: true
    }
}
