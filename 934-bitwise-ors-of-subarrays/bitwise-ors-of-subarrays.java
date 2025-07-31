class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> prev = new HashSet<>();

        for(int num : arr){
            Set<Integer> curr = new HashSet<>();
            curr.add(num);
            for(int p : prev){
                curr.add(p | num);
            }

            res.addAll(curr);
            prev = curr;
        }

        return res.size();
    }
}