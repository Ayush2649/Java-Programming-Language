class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            long spell = spells[i];

            long required = (success + spell - 1) / spell;

            int idx = lowerBound(potions, required);

            ans[i] = m - idx;
        }

        return ans;
    }

    public int lowerBound(int[] arr, long target){
        int left = 0, right = arr.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}