class Solution {
    int helper(int[] nums, int target, int[] dp) {
        if(target < 0) return 0;
        if (target == 0) return 1;
        if(dp[target] != -1) return dp[target];
        // int take = helper(index, nums, target - nums[index], dp);
        // int skip = helper(index+1, nums, target, dp);
        // return dp[target] = take+skip;
        int ans = 0;
        for(int num: nums){
            ans += helper(nums, target-num, dp);
        }
        return dp[target] = ans;
    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        return helper(nums, target, dp);
    }
}