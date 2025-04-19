class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int ele = -1;
        int cnt = 0;

        for(int num : nums){
            if(cnt == 0){
                ele = num;
                cnt++;
            } else if(ele == num) {
                cnt++;
            } else {
                cnt--;
            }
        }

        cnt = 0;

        for(int num : nums){
            if(ele == num) cnt++;
        }

        return (cnt > n / 2) ? ele : -1;
    }
}