class Solution {
    public void solve(int n, StringBuilder curr, List<String> result){
        if(curr.length() == n){
            result.add(curr.toString());
            return;
        }

        for(char ch = 'a'; ch <= 'c'; ch++){
            if(curr.length() > 0 && curr.charAt(curr.length() - 1) == ch) continue;

            curr.append(ch);

            solve(n, curr, result);

            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public String getHappyString(int n, int k) {
        StringBuilder curr = new StringBuilder();
        List<String> result = new ArrayList<>();
        solve(n, curr, result);

        if(result.size() < k) return "";

        return result.get(k - 1);
    }
}