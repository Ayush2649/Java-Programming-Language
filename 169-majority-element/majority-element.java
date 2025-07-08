class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;

        // for(int i = 0; i < n; i++){
        //     int count = 0;

        //     for(int j = 0; j < n; j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }

        //     if(count > n / 2) return arr[i];
        // }

        // return -1;

        int ele = -1, cnt = 0;

        for(int num : arr){
            if(cnt == 0){
                ele = num;
                cnt++;
            } else if (ele != num){
                cnt--;
            } else {
                cnt++;
            }
        }

        cnt = 0;

        for(int num : arr){
            if(num == ele) cnt++;
        }

        return cnt > n / 2 ? ele : -1; 
    }
}