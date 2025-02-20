class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(String num : nums){
            set.add(Integer.parseInt(num, 2));
        }

        int n = nums.length;

        String result = "";

        for(int number = 0; number <= 65536; number++){
            if(!set.contains(number)){
                result = Integer.toBinaryString(number);
                while(result.length() < n){
                    result = '0' + result;
                }
                return result;
            }
        }
        return "";
    }
}