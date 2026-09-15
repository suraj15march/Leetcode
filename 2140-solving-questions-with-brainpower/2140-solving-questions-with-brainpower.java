class Solution {
    long helper(int index, int[][] questions, long[] dp){
        if(index>=questions.length) return 0;
        if(dp[index] != -1L) return dp[index];
        int point = questions[index][0];
        int brainpower = questions[index][1]+1;
        long solve = point + helper(index+brainpower, questions, dp);
        long skip = helper(index+1, questions, dp);
        return dp[index] = Math.max(solve, skip);
    }
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        Arrays.fill(dp, -1);
        return helper(0, questions, dp);
    }
}