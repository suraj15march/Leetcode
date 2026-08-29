class Solution {
    int[] dp;

    int getOnes(int n) {
        if(dp[n] != -1) return dp[n];
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 1) {
            dp[n] = 1 + getOnes(n / 2);
        }
        else{
            dp[n] = getOnes(n / 2);
        }
        return dp[n];
    }

    public int[] countBits(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for (int i = 0; i <= n; i++) {
            dp[i] = getOnes(i);
        }
        return dp;
    }
}

// 0 - 0
// 1 - 1
// 2 - 1
// 3 - 2
// 4 - 1
// 5 - 2
// 6 - 2
// 7 - 3
// 8 - 1
// 9 - 2
// 10 - 2
// 11 - 3
