class Solution {
    int helper(int index, int[] freq, int[] dp){
        if(index>=freq.length) return 0;
        if(dp[index] != -1) return dp[index];
        int skip = helper(index+1, freq, dp);
        int take = freq[index]*index + helper(index+2, freq, dp);
        return dp[index] = Math.max(skip, take);
    }
    public int deleteAndEarn(int[] nums) {
        int maxEle = nums[0];
        for(int num: nums){
            maxEle = Math.max(maxEle, num);
        }
        int[] freq = new int[maxEle+1];
        for(int num: nums){
            freq[num]++;
        }
        int[] dp = new int[maxEle+1];
        Arrays.fill(dp, -1);
        return helper(0, freq, dp);
    }
}