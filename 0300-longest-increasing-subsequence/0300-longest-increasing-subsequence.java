class Solution {
    int helper(int[] nums, int index1, int index2, int dp[][]){
        if(index1 >= nums.length) return 0;
        if(dp[index1][index2+1] != -1) return dp[index1][index2+1];
        int a = 0, b = 0;
        if(index2==-1 || nums[index1]>nums[index2]) a = 1+helper(nums, index1+1, index1, dp);
        b = helper(nums, index1+1, index2, dp);
        return dp[index1][index2+1] = Math.max(a, b);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(nums, 0, -1, dp);
    }
}