class Solution {
    int helper(int[] days, int[] costs, int index, int[]dp) {
        int n = days.length;
        if (index >= n) return 0;

        if(dp[index] != -1) return  dp[index];

        int one = costs[0] + helper(days, costs, index+1, dp);

        int sevenIndex = index;
        while(sevenIndex < n && days[sevenIndex] < days[index]+7) sevenIndex++;

        int seven = costs[1] + helper(days, costs, sevenIndex, dp);

        int thirtyIndex = index;
        while(thirtyIndex < n && days[thirtyIndex] < days[index]+30) thirtyIndex++;

        int thirty = costs[2] + helper(days, costs, thirtyIndex, dp);

        dp[index] = Math.min(one, Math.min(seven, thirty));
        return dp[index];
    }

    public int mincostTickets(int[] days, int[] costs) {
        int[]dp = new int[days.length];
        Arrays.fill(dp, -1);
        return helper(days, costs, 0, dp);
    }
}