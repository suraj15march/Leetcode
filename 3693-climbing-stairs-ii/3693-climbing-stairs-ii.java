import java.util.Arrays;

class Solution {
    private int[] memo;
    private int[] c;

    public int helper(int j) {
        if (j == 0) return 0;
        if (memo[j] != -1) return memo[j];

        int minCost = Integer.MAX_VALUE;

        // Try jumping from i to j, where i can be j-1, j-2, or j-3
        for (int step = 1; step <= 3; step++) {
            int prev = j - step;
            if (prev >= 0) {
                int cost = helper(prev) + c[j - 1] + (step * step);
                minCost = Math.min(minCost, cost);
            }
        }

        return memo[j] = minCost;
    }

    public int climbStairs(int n, int[] costs) {
        this.c = costs;
        this.memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return helper(n);
    }
}