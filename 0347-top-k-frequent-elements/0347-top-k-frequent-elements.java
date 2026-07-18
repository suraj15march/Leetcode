class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap();
        for(int it: nums){
            map.put(it, map.getOrDefault(it, 0)+1);
        }
        PriorityQueue<Integer>minHeap = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(int num: map.keySet()){
            minHeap.offer(num);
            if(minHeap.size()>k) minHeap.poll();
        }
        int[] ans = new int[k];
        while(!minHeap.isEmpty() && k>0){
            k--;
            ans[k] = minHeap.poll();
        }
        return ans;
    }
}