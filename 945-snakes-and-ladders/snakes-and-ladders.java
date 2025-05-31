class Solution {
    int n;

    public int[] getCoordinates(int num){
        int row = n - 1 - (num - 1) / n;
        int col = (num - 1) % n;

        if((n % 2 == 1 && row % 2 == 1) || (n % 2 == 0 && row % 2 == 0)){
            col = n - 1 - col;
        }

        return new int[] {row, col};
    }

    public int snakesAndLadders(int[][] board) {
        n = board.length;
        boolean[][] visited = new boolean[n][n];
        Queue<Integer> que = new LinkedList<>();

        que.offer(1);
        visited[n - 1][0] = true;

        int steps = 0;

        while(!que.isEmpty()){
            int size = que.size();

            while(size-- > 0){
                int curr = que.poll();

                if(curr == n * n) return steps;

                for(int dice = 1; dice <= 6; dice++){

                    int next = curr + dice;

                    if(next > n * n) break;

                    int[] coord = getCoordinates(next);
                    int row = coord[0], col = coord[1];

                    if(visited[row][col]) continue;

                    visited[row][col] = true;

                    if(board[row][col] == -1){
                        que.offer(next);
                    } else {
                        que.offer(board[row][col]);
                    }
                }
            }
            steps++; 
        }    

        return -1;
    }
}