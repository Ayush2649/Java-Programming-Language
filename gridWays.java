public class gridWays{

    public static int GridCount(int i, int j, int n, int m){
        if(i == n - 1 && j == m - 1){
            return 1;
        } else if(i == n || j == m) {
            return 0;
        }
        int w1 = GridCount(i + 1, j, n, m);
        int w2 = GridCount(i, j + 1, n, m);
        return w1 + w2;
    }
    
    public static void main(String[] args){
        int n = 3, m = 3;
        System.out.println("Number of ways to reach the bottom right cell is: " + GridCount(0, 0, n ,m));
    }
}