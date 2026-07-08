class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        int n = nums.length;
        for(int i=0; i<n; i++) pq.offer(nums[i]);
        k = n-k;
        while(k>0){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}