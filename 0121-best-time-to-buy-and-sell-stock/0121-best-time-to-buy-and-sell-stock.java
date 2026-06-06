class Solution {
    public int maxProfit(int[] prices) {
        int result = 0, n = prices.length;
        int minVal = prices[0];
        for(int i=1; i<n; i++){
            result = Integer.max(result, prices[i]-minVal);
            if(minVal > prices[i]) minVal = prices[i];
        }
        return result;
    }
}