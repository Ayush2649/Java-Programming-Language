class Solution {
    public int findClosest(int x, int y, int z) {
        int xDist = Math.abs(z - x); // 2
        int yDist = Math.abs(z - y); // 3

        if(xDist < yDist){
            return 1;
        } else if (yDist < xDist){
            return 2;
        } else {
            return 0;
        }
    }
}