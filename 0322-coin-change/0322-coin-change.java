class Solution {
    int dp[][];
    public int helper(int[] coins, int index, int amount) {
        if(amount == 0) return 0;
        if(amount<0 || index == coins.length) return (int) 1e9;
        if(dp[index][amount]!=-1) return dp[index][amount];
        dp[index][amount] = Math.min(1+helper(coins, index, amount-coins[index]), helper(coins, index+1, amount));
        return dp[index][amount];
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new int[n][amount+1];
        for(int i=0; i<n; i++){
            for(int j=0;j<=amount; j++){
                dp[i][j] = -1;
            }
        }
        // int ans = helper(coins, 0, amount);
        // return ans>=1e9? -1: ans;
        int ans = helper(coins, 0, amount);
        return ans>=1e9? -1: ans;
    }
}