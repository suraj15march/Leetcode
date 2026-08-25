class Solution {
    int[][] dp;

    int helper(String text1, String text2, int i, int j) {
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + helper(text1, text2, i + 1, j + 1);
            return dp[i][j];
        }
        dp[i][j] = Math.max(helper(text1, text2, i + 1, j), helper(text1, text2, i, j + 1));
        return dp[i][j];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(text1, text2, 0, 0);
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=n; j++){
        //         if(text1.charAt(i-1) == text2.charAt(j-1)){
        //             dp[i][j] = 1+dp[i-1][j-1];
        //         }
        //         else{
        //             dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
        //         }
        //     }
        // }
        // return dp[m][n];
    }
}