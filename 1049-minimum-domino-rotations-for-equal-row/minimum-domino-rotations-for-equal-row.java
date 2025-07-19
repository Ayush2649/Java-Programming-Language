class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int result = Math.min(check(tops[0], tops, bottoms), check(bottoms[0], tops, bottoms));
        
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int check(int target, int[] tops, int[] bottoms){
        int rotationsTop = 0;
        int rotationsBottom = 0;

        for(int i = 0; i < tops.length; i++){
            if(tops[i] != target && bottoms[i] != target){
                return Integer.MAX_VALUE;
            } else if (tops[i] != target) {
                rotationsTop++;
            } else if (bottoms[i] != target) {
                rotationsBottom++;
            }
        }

        return Math.min(rotationsBottom, rotationsTop);
    }
}