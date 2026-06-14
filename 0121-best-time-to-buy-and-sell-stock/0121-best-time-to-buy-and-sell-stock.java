class Solution {
    public int maxProfit(int[] prices) {
        int result = 0, n = prices.length;
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            result = Integer.max(result, prices[i]-minVal);
            minVal = Math.min(minVal, prices[i]);
        }
        return result;
    }
}