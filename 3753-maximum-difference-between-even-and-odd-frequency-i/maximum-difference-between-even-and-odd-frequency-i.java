class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int freq : freqMap.values()){
            if(freq % 2 == 0){
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        return (maxOdd != Integer.MIN_VALUE && minEven != Integer.MAX_VALUE) ? (maxOdd - minEven) : 0;
        
    }
}