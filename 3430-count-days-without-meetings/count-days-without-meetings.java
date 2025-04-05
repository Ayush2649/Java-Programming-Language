class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;
        int end = 0;

        for(int[] meet: meetings){
            if(meet[0] > end){
                result += meet[0] - end - 1;
            }
            end = Math.max(meet[1], end);
        }

        if(days > end){
            result += days - end;
        }

        return result;
    }
}