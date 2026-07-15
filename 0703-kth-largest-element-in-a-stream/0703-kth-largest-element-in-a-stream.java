class KthLargest {
    PriorityQueue<Integer>pq;
    int capacity = 0;
    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue();
        this.capacity = k;
        for(int it: nums){
            if(pq.size()==k){
                if(it>pq.peek()){
                    pq.poll();
                    pq.offer(it);
                }
                continue;
            }
            pq.offer(it);
        }
    }
    
    public int add(int val) {
        if(pq.size()<this.capacity){
            pq.offer(val);
        }
        else if(!pq.isEmpty() && val>pq.peek()){
            if(pq.size() == this.capacity){
                pq.poll();
            }
            pq.offer(val);
        }
        // if(pq.isEmpty()) return 0;
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */