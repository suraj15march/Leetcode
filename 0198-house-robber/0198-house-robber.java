class Solution {
    int[] dp;
    int helper(int[] nums, int index){
        if(index >= nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        dp[index] = Math.max((nums[index] + helper(nums, index+2)), helper(nums, index+1));
        return dp[index];
    }
    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return helper(nums, 0);
    }
}