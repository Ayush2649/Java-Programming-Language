class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                nums.add(grid[i][j]);
            }
        }

        Collections.sort(nums);
        int target = nums.get(nums.size() / 2);

        int result = 0;
        for(int num : nums){
            if(num % x != target % x){
                return -1;
            } 
            result += Math.abs(target - num) / x;
        }

        return result;
    }
}