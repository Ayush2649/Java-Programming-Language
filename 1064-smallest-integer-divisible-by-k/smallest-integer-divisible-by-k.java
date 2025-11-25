class Solution {
    public int smallestRepunitDivByK(int k) {
        int num = 0;

        for(int len = 1; len <= k; len++){
            num = (num * 10 + 1) % k;
            if(num == 0) return len;
        }

        return -1;
    }
}