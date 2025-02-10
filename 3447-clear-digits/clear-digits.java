class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                stack.push(ch);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}