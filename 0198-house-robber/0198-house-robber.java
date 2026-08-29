class Solution {
    int helper(int[] nums, int index, int dp[]){
        if(index>=nums.length) return 0;
        if(dp[index] != -1) return dp[index];
        int a = helper(nums, index+1, dp);
        int b = nums[index] + helper(nums, index+2, dp);
        dp[index] = Math.max(a,b);
        return dp[index];
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
}