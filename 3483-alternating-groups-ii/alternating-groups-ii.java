class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int N = n + (k - 1);

        int[] extended = new int[N];
        System.arraycopy(colors, 0, extended, 0 , n);
        for(int i = 0; i < k - 1; i++) {
            extended[n + i] = colors[i];
        }

        int result = 0;
        int i = 0, j = 1;

        while(j < N) {
            if(extended[j] == extended[j - 1]) {
                i = j;
                j++;
                continue;
            }

            if(j - i + 1 == k) {
                result++;
                i++;
            }

            j++;
        }

        return result;
    }
}