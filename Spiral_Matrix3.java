public class Spiral_Matrix3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dir = new int[][] {  
                                    {0, 1}, // EAST
                                    {1, 0}, // SOUTH
                                    {0, -1}, // WEST
                                    {-1, 0} // NORTH
                                    };

        int result[][] = new int[rows * cols][2];
        int idx = 0;

        for(int steps = 1, direction = 0; idx < rows * cols;){
            for(int i = 0; i < 2; ++i){
                for(int j = 0; j < steps; ++j){
                    if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                        result[idx][0] = rStart;
                        result[idx][1] = cStart;
                        ++idx;
                    }
                    rStart += dir[direction][0];
                    cStart += dir[direction][1];
                }
                direction = (direction + 1) % 4;
            }
            ++steps;
        }
        return result;
    }
}
