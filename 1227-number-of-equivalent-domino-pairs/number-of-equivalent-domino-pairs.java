class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] nums = new int[100];

        int result = 0;

        for(int[] d : dominoes){
            int a = d[0], b = d[1];
            if(a > b){
                int temp = a;
                a = b;
                b = temp;
            }

            int num = a * 10 + b;
            result += nums[num];
            nums[num]++;
        }

        return result;
    }
}