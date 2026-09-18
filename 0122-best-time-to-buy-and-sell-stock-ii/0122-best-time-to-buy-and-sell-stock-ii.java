class Solution {
    int helper(int index, int canBuy, int[] prices, int[][]dp){
        if(index>=prices.length) return 0;

        if(dp[index][canBuy] != -1) return dp[index][canBuy];

        int skip = helper(index+1, canBuy, prices, dp);

        if(canBuy == 1){
            int buy = -prices[index] + helper(index+1, 0, prices, dp);
            return dp[index][canBuy] = Math.max(buy, skip);
        }
        int sell = prices[index] + helper(index+1, 1, prices, dp);
        return dp[index][canBuy] = Math.max(sell, skip);
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(0, 1, prices, dp);
    }
}