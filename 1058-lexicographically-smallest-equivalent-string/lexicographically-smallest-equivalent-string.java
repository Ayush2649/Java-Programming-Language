class Solution {
    public char dfs(Map<Character, List<Character>> adj, char ch, boolean[] visited){
        visited[ch - 'a'] = true;
        char minChar = ch;

        for(char neighbour : adj.getOrDefault(ch, new ArrayList<>())){
            if(!visited[neighbour - 'a']){
                char nextMin = dfs(adj, neighbour, visited);
                if(nextMin < minChar){
                    minChar = nextMin;
                }
            }
        }

        return minChar;
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Map<Character, List<Character>> adj = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            char u = s1.charAt(i);
            char v = s2.charAt(i);

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        StringBuilder result = new StringBuilder();

        for(char ch : baseStr.toCharArray()){
            boolean[] visited = new boolean[26];
            result.append(dfs(adj, ch, visited));
        }

        return result.toString();
    }
}