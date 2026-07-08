class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int it: nums) pq.offer(it);
        k = nums.length-k;
        while(k>0){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}