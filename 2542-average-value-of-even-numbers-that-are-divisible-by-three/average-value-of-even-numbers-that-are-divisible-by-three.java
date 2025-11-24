class Solution {
    public int averageValue(int[] nums) {
        int ans = 0;
        List<Integer> divisibles = new ArrayList<>();

        for(int num : nums){
            if(num % 2 == 0 && num % 3 == 0){
                divisibles.add(num);
            }
        }

        if(divisibles.size() == 0) return 0;

        int sum = 0;
        for(int i = 0; i < divisibles.size(); i++){
            sum += divisibles.get(i);
        }

        return sum / divisibles.size();
    }
}