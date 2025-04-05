class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add((long) num);
        }

        int count = 0;

        while(!pq.isEmpty() && pq.peek() < k){
            long smallest = pq.poll();

            long secondSmallest = pq.poll();

            pq.add(smallest * 2 + secondSmallest);

            count++;
        }

        return count;
    }
}