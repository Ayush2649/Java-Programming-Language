class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int i = q.poll();
            if(arr[i] == 0) return true;

            int[] nexts = {i + arr[i], i - arr[i]};
            for(int nxt : nexts){
                if(nxt >= 0 && nxt < n && !visited[nxt]){
                    visited[nxt] = true;
                    q.add(nxt);
                }
            }
        }

        return false;
    }
}