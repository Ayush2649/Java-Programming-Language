class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);

        // int n = nums.length;

        // if(n == 0) return 0;

        // int cnt = 1, res = 1;

        // for(int i = 1; i < n; i++){
        //     if(nums[i] == nums[i - 1]){
        //         continue;
        //     } else if(nums[i] == nums[i - 1] + 1){
        //         cnt++;
        //     } else {
        //         cnt = 1;
        //     }

        //     res = Math.max(res, cnt);
        // }

        // return res;

        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        int res = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(set.contains(num) && !set.contains(num - 1)){
                int curr = num, cnt = 0;

                while(set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    cnt++;
                }

                res = Math.max(cnt, res);
            }
        }

        return res;
    }
}