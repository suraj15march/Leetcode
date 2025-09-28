class Solution {

    private Boolean[][] ans;

    private boolean subsetSum(int[] nums, int sum, int index){
        if(sum == 0) return true;
        if(index>nums.length-1 || sum <0) {
            return false;
        }
        // if(nums[index] > sum) return false;
        if(ans[index][sum] != null) return ans[index][sum];
        ans[index][sum] = (subsetSum(nums, sum-nums[index], index+1) || subsetSum(nums, sum, index+1));
        return ans[index][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum%2 == 1) return false;
        ans = new Boolean[nums.length][sum/2+1];
        return subsetSum(nums, sum/2, 0);
    }
}