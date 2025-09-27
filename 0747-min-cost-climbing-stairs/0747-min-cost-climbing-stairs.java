class Solution {
    private int ans[];
    private int func(int[] cost, int index){
        int n = cost.length;
        if(index >= n) return 0;

        if(ans[index]!=-1) return ans[index];

        ans[index] = cost[index] + Math.min(func(cost,index+1), func(cost,index+2));

        return ans[index];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        ans = new int[n];
        Arrays.fill(ans, -1);
        return Math.min(func(cost,0), func(cost,1));
    }
}