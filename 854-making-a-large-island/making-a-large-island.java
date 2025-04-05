class Solution {
    private int m, n;
    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int largestIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int maxArea = 0;
        Map<Integer, Integer> isLandSizes = new HashMap<>();
        int landId = 2;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    int size = dfs(grid, i, j, landId);
                    maxArea = Math.max(maxArea, size);
                    isLandSizes.put(landId, size);
                    landId++;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    Set<Integer> uniqueIslands = new HashSet<>();
                    for(int[] dir : directions){
                        int x = i + dir[0];
                        int y = j + dir[1];

                        if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] != 0){
                            uniqueIslands.add(grid[x][y]);
                        }
                    }

                    int sum = 1;
                    for(int id : uniqueIslands){
                        sum += isLandSizes.get(id);
                    }
                    maxArea = Math.max(maxArea, sum);
                }
            }
        }   

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int id){
        if(i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != 1){
            return 0;
        }

        grid[i][j] = id;
        int count = 1;

        for(int[] dir : directions){
            count += dfs(grid, i + dir[0], j + dir[1], id);
        }

        return count;
    }
}