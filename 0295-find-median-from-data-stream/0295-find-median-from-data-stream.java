class MedianFinder {
    int size;
    PriorityQueue<Integer>smaller;
    PriorityQueue<Integer>greater;

    public MedianFinder() {
        size = 0;
        smaller = new PriorityQueue<>();
        greater = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        if(size%2==0){
            smaller.offer(num);
            greater.offer(smaller.poll());
        }
        else{
            greater.offer(num);
            smaller.offer(greater.poll());
        }
        size++;
    }
    
    public double findMedian() {
        if(size%2==0){
            return (double) (smaller.peek()+greater.peek())/2;
        }
        return (double) greater.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */