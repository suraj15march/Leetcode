class KthLargest {
    PriorityQueue<Integer> pq;
    int capacity = 0;

    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue();
        this.capacity = k;
        for (int val : nums) {
            if (pq.size() < k)
                pq.offer(val);
            else if (pq.peek() < val) {
                pq.poll();
                pq.offer(val);
            }
        }
    }

    public int add(int val) {
        if (pq.size() < this.capacity) {
            pq.offer(val);
        } else if (pq.peek() < val) {
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */