class Solution {
    int helper(int index, int canBuy, int[] prices, int fee, int[][] dp){
        if(index >= prices.length) return 0;
        if(dp[index][canBuy] != -1) return dp[index][canBuy];

        int skip = helper(index+1, canBuy, prices, fee, dp);
        if(canBuy == 1){
            int buy = -prices[index] + helper(index+1, 0, prices, fee, dp);
            return dp[index][canBuy] = Math.max(skip, buy);
        }
        int sell = prices[index]-fee + helper(index+1, 1, prices, fee, dp);
        return dp[index][canBuy] = Math.max(skip, sell);
    }
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(0, 1, prices, fee, dp);
    }
}