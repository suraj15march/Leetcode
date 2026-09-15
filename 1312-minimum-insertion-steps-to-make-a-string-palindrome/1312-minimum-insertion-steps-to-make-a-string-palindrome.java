class Solution {
    int LCS(int index1, int index2, String s1, String s2, int[][] dp){
        if(index1>=s1.length() || index2>=s2.length()) return 0;
        if(dp[index1][index2] != -1) return dp[index1][index2];
        if(s1.charAt(index1) == s2.charAt(index2)) return dp[index1][index2] = 1+LCS(index1+1, index2+1, s1, s2, dp);
        return dp[index1][index2] = Math.max(LCS(index1+1, index2, s1, s2, dp), LCS(index1, index2+1, s1, s2, dp));
    }
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return n - LCS(0, 0, s, new StringBuilder(s).reverse().toString(), dp);
    }
}
