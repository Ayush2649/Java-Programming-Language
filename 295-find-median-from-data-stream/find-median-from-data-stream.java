class MedianFinder {

    private PriorityQueue<Integer> leftMaxHeap;
    private PriorityQueue<Integer> rightMinHeap;

    public MedianFinder() {
        leftMaxHeap = new PriorityQueue<>((a, b) -> b - a);
        rightMinHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        leftMaxHeap.offer(num);

        if(!leftMaxHeap.isEmpty() && !rightMinHeap.isEmpty() && leftMaxHeap.peek() > rightMinHeap.peek()){
            rightMinHeap.offer(leftMaxHeap.poll());
        }

        if(leftMaxHeap.size() - rightMinHeap.size() > 1){
            rightMinHeap.offer(leftMaxHeap.poll());
        }

        if(rightMinHeap.size() > leftMaxHeap.size()){
            leftMaxHeap.offer(rightMinHeap.poll());
        }
    }
    
    public double findMedian() {
        if(leftMaxHeap.isEmpty()) return 0.0;

        if(leftMaxHeap.size() == rightMinHeap.size()){
            return (leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
        } else {
            return leftMaxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */