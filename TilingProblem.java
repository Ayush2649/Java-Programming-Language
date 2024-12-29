public class TilingProblem{
    public static int Tiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        
        // Vertical Approach
        int fnm1 = Tiling(n - 1);

        // Horizontal Approach
        int fnm2 = Tiling(n - 2);

        int totTiles = fnm1 + fnm2;
        return totTiles;
    }

    public static void main(String args[]){
        System.out.println(Tiling(4));
    }
}