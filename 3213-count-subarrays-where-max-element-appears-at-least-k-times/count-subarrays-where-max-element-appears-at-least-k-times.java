class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxEle = nums[0];
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] > maxEle){
                maxEle = nums[i];
            }
        }

        long res = 0;
        int maxCount = 0;
        int i = 0, j = 0;

        while(j < n){
            if(nums[j] == maxEle){
                maxCount++;
            }

            while(maxCount >= k){
                res += n - j;

                if(nums[i] == maxEle){
                    maxCount--;
                }

                i++;
            }

            j++;
        }

        return res;
    }
}