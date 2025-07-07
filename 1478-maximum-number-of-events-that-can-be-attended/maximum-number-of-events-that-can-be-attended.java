class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int day = 0;
        int i = 0;
        int n = events.length;
        int count = 0;

        int maxDay = 0;

        for(int[] event : events){
            maxDay = Math.max(maxDay, event[1]);
        }

        for(day = 1; day <= maxDay; day++){
            while(i < n && events[i][0] == day){
                minHeap.offer(events[i][1]);
                i++;
            }

            while(!minHeap.isEmpty() && minHeap.peek() < day){
                minHeap.poll();
            }

            if(!minHeap.isEmpty()){
                minHeap.poll();
                count++;
            }
        }

        return count;
    }
}