class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        
        int counter = 0;
        int result = 0;

        while(n >= 1) {
            int r = n % 2;
            int flipped = 1 - r;
            result += Math.pow(2, counter) * flipped;

            counter++;
            n /= 2;
        } 

        return result;
    }
}