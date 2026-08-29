class Solution {
    int[] dp;

    // int getOnes(int n) {
    //     if (dp[n] != -1)
    //         return dp[n];
    //     if (n == 0) {
    //         return 0;
    //     }
    //     if (n % 2 == 1) {
    //         dp[n] = 1 + getOnes(n / 2);
    //     } else {
    //         dp[n] = getOnes(n / 2);
    //     }
    //     return dp[n];
    // }

    public int[] countBits(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        if (n == 0) {
            return dp;
        }
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 1) {
                dp[i] = 1 + dp[i / 2];
            } else {
                dp[i] = dp[i / 2];
            }
        }
        return dp;
    }
}