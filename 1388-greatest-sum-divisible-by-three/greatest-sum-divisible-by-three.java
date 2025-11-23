class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min11 = Integer.MAX_VALUE;
        int min22 = Integer.MAX_VALUE;

        for(int x : nums){
            sum += x;
            int r = x % 3;

            if(r == 1){
                if(x < min1){
                    min11 = min1;
                    min1 = x;
                } else if (x < min11){
                    min11 = x;
                }
            } else if (r == 2) {
                if(x < min2){
                    min22 = min2;
                    min2 = x;
                } else if (x < min22){
                    min22 = x;
                }
            }
        }

        if(sum % 3 == 0) return sum;

        int res = 0;

        if(sum % 3 == 1){
            int option1 = min1;
            int option2 = (min2 == Integer.MAX_VALUE || min22 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : min2 + min22;
            res = sum - Math.min(option1, option2);
        } else if (sum % 3 == 2) {
            int option1 = min2;
            int option2 = (min1 == Integer.MAX_VALUE || min11 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : min1 + min11;
            res = sum - Math.min(option1, option2);
        }

        return res < 0 ? 0 : res;
    }
}