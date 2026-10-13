class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        int n = nums.length / 2;
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        for (long num : nums) {
            sum += num * num;
            pq.offer(Math.abs(num));
            if(pq.size()>n) pq.poll();
        }
        while(!pq.isEmpty()){
            long num = pq.poll();
            sum -= 2*num*num;
        }
        return sum;
    }
}