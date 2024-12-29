public class Find_Missing_and_Repeated_Values {
    public int[] findMissingandRepeatingValues(int[][] grid){
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        for(int[] rows : grid){
            for(int col : rows){
                freq[col]++;
            }
        }

        int[] ans = new int[2];
        for(int i = 1; i <= n * n; i++){
            if(freq[i] == 2){
                ans[0] = i;
            } else if(freq[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Find_Missing_and_Repeated_Values solution = new Find_Missing_and_Repeated_Values();
        
        int[][] grid = {
            {1, 3},
            {2, 2},
        };

        int[] result = solution.findMissingandRepeatingValues(grid);
  
        System.out.println("Repeated value: " + result[0]);
        System.out.println("Missing value: " + result[1]);
    }
}
