class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int x : answers){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        int total = 0;

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int x = entry.getKey();
            int count = entry.getValue();

            int groupSize = x + 1;
            int groups = (int) Math.ceil ((double) count / groupSize);

            total += groups * groupSize;
        }

        return total;
    }
}