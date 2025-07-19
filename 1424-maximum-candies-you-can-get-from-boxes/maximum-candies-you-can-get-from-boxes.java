class Solution {
    public int dfs(int box, int[] status, int[] candies, int[][] keys, int[][] containedBoxes, Set<Integer> visited, Set<Integer> foundBoxes){
        if(visited.contains(box)) return 0;

        if(status[box] == 0){
            foundBoxes.add(box);
            return 0;
        }

        visited.add(box);
        int candiesCollected = candies[box];

        for(int innerBox : containedBoxes[box]){
            candiesCollected += dfs(innerBox, status, candies, keys, containedBoxes, visited, foundBoxes);
        }

        for(int boxKey : keys[box]){
            status[boxKey] = 1;
            if(foundBoxes.contains(boxKey)){
                candiesCollected += dfs(boxKey, status, candies, keys, containedBoxes, visited, foundBoxes);
            }
        }

        return candiesCollected;
    }

    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int candiesCollected = 0;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> foundBoxes = new HashSet<>();

        for(int box : initialBoxes){
            candiesCollected += dfs(box, status, candies, keys, containedBoxes, visited, foundBoxes);
        }

        return candiesCollected;
    }
}