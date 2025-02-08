class NumberContainers {
    private Map<Integer, Integer> idxToNum;
    private Map<Integer, TreeSet<Integer>> numToIdx;

    public NumberContainers() {
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(idxToNum.containsKey(index)){
            int prevNum = idxToNum.get(index);
            numToIdx.get(prevNum).remove(index);
            if(numToIdx.get(prevNum).isEmpty()){
                numToIdx.remove(prevNum);
            }
        }

        idxToNum.put(index, number);
        numToIdx.putIfAbsent(number, new TreeSet<>());
        numToIdx.get(number).add(index);
    }
    
    public int find(int number) {
        if(numToIdx.containsKey(number)){
            return numToIdx.get(number).first();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */