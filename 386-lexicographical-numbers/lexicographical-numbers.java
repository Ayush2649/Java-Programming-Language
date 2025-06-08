class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> lexicographicalNumbers = new ArrayList<>();

        int currentNumber = 1;

        for(int i = 0; i < n; ++i){
            lexicographicalNumbers.add(currentNumber);

            if(currentNumber * 10 <= n){
                currentNumber *= 10;
            } else {
                while(currentNumber % 10 == 9 || currentNumber >= n){
                    currentNumber /= 10;
                }
                currentNumber += 1;
            }
        }
        return lexicographicalNumbers;
    }
}