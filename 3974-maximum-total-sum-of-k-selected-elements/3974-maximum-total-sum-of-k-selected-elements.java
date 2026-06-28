class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int a:nums){
            pq.add(a);
        }
        while(!pq.isEmpty() && k>0){
            int t = pq.poll();
            if(mul>0){
                ans += (long)t*mul;
                mul--;
            }
            else{
                ans += t;
            }
            k--;
        }
        return ans;
    }
}