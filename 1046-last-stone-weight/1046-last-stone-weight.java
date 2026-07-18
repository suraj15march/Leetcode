class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int it: stones) pq.offer(it);
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a == b) continue;
            pq.offer(a-b);
        }
        return pq.isEmpty()?0:pq.peek();
    }
}