class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int m = nums.length;
        int n = queries.length;

        int[] cumSum = new int[m];
        cumSum[0] = 0;

        for(int i = 1; i < m; i++){
            if(nums[i]%2 == nums[i - 1]%2){
                cumSum[i] = cumSum[i - 1] + 1;
            } else {
                cumSum[i] = cumSum[i - 1];
            }
        }

        boolean[] result = new boolean[n];
        int i = 0;
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];

            if(cumSum[end] - cumSum[start] == 0){
                result[i] = true;
            }
            i++;
        }

        return result;
    }
}