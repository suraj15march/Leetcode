class Solution {
    int solve(String word1, String word2, int index1, int index2, int[][] dp) {
        int m = word1.length(), n = word2.length();
        
        if (index1 >= m) return n - index2;
        if (index2 >= n) return m - index1;

        if(dp[index1][index2] != -1) return dp[index1][index2];
        
        if (word1.charAt(index1) == word2.charAt(index2)) {
            return solve(word1, word2, index1 + 1, index2 + 1, dp);
        }
        
        int deleteOp = solve(word1, word2, index1 + 1, index2, dp);
        int insertOp = solve(word1, word2, index1, index2 + 1, dp);
        int replaceOp = solve(word1, word2, index1 + 1, index2 + 1, dp);
        
        return dp[index1][index2] = 1 + Math.min(deleteOp, Math.min(insertOp, replaceOp));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m][n];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return solve(word1, word2, 0, 0, dp);
    }
}