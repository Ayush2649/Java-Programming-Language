class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int k = (int) Math.sqrt(i * i + j * j + 1.0);
                if(k <= n && k * k == i * i + j * j) count++;
            }
        }

        return count;
    }
}