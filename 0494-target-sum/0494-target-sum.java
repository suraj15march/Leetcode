class Solution {
    int subsetSum(int index, int target, int[] nums, int[][] dp){
        if(index>=nums.length){
            return target==0? 1: 0;
        }
        if(target<0) return 0;
        if(dp[index][target] != -1) return dp[index][target];
        return dp[index][target] = subsetSum(index+1, target-nums[index], nums, dp) + subsetSum(index+1, target, nums, dp);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num: nums) sum += num;
        if(Math.abs(target)>sum || (sum+target)%2 !=0 ) return 0;
        int s1 = (sum+target)/2;
        int[][] dp = new int[nums.length][s1+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return subsetSum(0, s1, nums, dp);
    }
}