class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            int target = 2 * arr[i];

            int idx = Arrays.binarySearch(arr, target);

            if(idx >= 0 && idx != i) return true;
        }

        return false;
    }
}