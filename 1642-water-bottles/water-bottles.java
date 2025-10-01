class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int emptyBottles = numBottles;

        while(emptyBottles >= numExchange){
            int newBottles = emptyBottles / numExchange;

            int remainingEmpty = emptyBottles % numExchange;

            totalDrank += newBottles;

            emptyBottles = newBottles + remainingEmpty;
        }

        return totalDrank;
    }
}