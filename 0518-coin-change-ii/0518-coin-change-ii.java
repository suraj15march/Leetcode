class Solution {
    int dp[][];

    int helper(int amount, int index, int[] coins) {
        if (index < 0 || amount < 0)
            return 0;
        if (dp[amount][index] != -1)
            return dp[amount][index];
        if (amount == 0) {
            dp[amount][index] = 1;
            return dp[amount][index];
        }
        dp[amount][index] = helper(amount - coins[index], index, coins) + helper(amount, index - 1, coins);
        return dp[amount][index];
    }

    public int change(int amount, int[] coins) {
        int n = coins.length;
        dp = new int[amount + 1][n];
        for(int i=0; i<=amount; i++){
             Arrays.fill(dp[i], -1);
        }
        helper(amount, coins.length - 1, coins);
        return dp[amount][n-1];
    }
}