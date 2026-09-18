class Solution {
    int helper(int index, int canBuy, int k, int[] prices, int[][][] dp){
        if(index>=prices.length || k<0) return 0;
        if(dp[index][canBuy][k] != -1) return dp[index][canBuy][k];
        int skip = helper(index+1, canBuy, k, prices, dp);
        if(canBuy == 1){
            int buy = -prices[index] + helper(index+1, 0, k-1, prices, dp);
            return dp[index][canBuy][k] = Math.max(skip, buy);
        }
        int sell = prices[index] + helper(index+1, 1, k, prices, dp);
        return dp[index][canBuy][k] = Math.max(skip, sell);
    }
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];
        for(int[][] arr: dp){
            for(int[] a: arr){
                Arrays.fill(a, -1);
            }
        }
        return helper(0, 1, 2, prices, dp);
    }
}