class Solution {
    int subsetSum(int index, int target, int[] nums, int[][]dp){
        if(index>=nums.length || target<0) return 0;
        if(dp[index][target] != -1) return dp[index][target];
        if(target == 0) return 1;
        return dp[index][target] = Math.max(subsetSum(index+1, target-nums[index], nums, dp), subsetSum(index+1, target, nums, dp));
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) sum += num;
        if(sum%2 != 0) return false;
        int n = nums.length;
        int target = sum/2;
        int[][]dp = new int[n][target+1];
        for(int[]arr: dp){
            Arrays.fill(arr, -1);
        }
        return subsetSum(0, target, nums, dp) == 1;
    }
}