class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> q = new LinkedList<>();
        Set<String> seen = new HashSet<>();

        String ans = s;
        q.offer(s);
        seen.add(s);

        while(!q.isEmpty()){
            String curr = q.poll();
            if(curr.compareTo(ans) < 0) ans = curr;

            String addNo = add(curr, a);
            if(seen.add(addNo)) q.offer(addNo);

            String rotateNo = rotate(curr, b);
            if(seen.add(rotateNo)) q.offer(rotateNo);
        }

        return ans;
    }

    private String add(String s, int a){
        char[] arr = s.toCharArray();
        for(int i = 1; i < s.length(); i += 2){
            arr[i] = (char) ((arr[i] - '0' + a) % 10 + '0');
        }

        return new String(arr);
    }

    private String rotate(String s, int b){
        int n = s.length();
        b %= n;
        return s.substring(n - b) + s.substring(0, n - b);
    }
}