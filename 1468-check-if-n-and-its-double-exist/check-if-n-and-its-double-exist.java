class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int zeroCount = 0;

        for(int num : arr){
            if(num == 0) zeroCount++;
            set.add(num);
        }

        if(zeroCount >= 2) return true;

        for(int num : arr){
            if(num != 0 && set.contains(num * 2)) return true;
        }

        return false;
    }
}