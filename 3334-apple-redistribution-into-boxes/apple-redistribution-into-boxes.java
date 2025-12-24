class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);

        int sum = 0; 
        int count = 0;
        for(int a : apple){
            sum += a;
        }

        for(int i = capacity.length - 1; i >= 0 && sum > 0; i--){
            sum -= capacity[i];
            count++;
        }

        return count;
    }
}