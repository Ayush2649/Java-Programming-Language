class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                result.append(ch);
            } else if (result.length() > 0){
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }
}