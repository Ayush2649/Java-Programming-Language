class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;

        if(k == 1) return n;

        int[] diff = new int[n];
        for(int i = 0; i < n; i++) {
            diff[i] = (colors[i] != colors[(i + 1) % n]) ? 1 : 0;
        }

        int extended[] = new int[n + k - 1];
        for(int i = 0; i < extended.length; i++){
            extended[i] = diff[i % n];
        }

        int windowSum = 0;
        for(int i = 0; i < k - 1; i++) {
            windowSum += extended[i];
        }

        int count = 0;
        if(windowSum == k - 1) count++;

        for(int i = 1; i < n; i++) {
            windowSum = windowSum - extended[i - 1] + extended[i + k - 2];
            if(windowSum == k - 1) count++;
        }
        
        return count;
    }
}