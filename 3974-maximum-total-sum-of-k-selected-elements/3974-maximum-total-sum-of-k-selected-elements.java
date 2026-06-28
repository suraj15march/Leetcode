class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for(int i=n-1; i>=n-k; i--){
            if(mul>1){
                 ans += (long) nums[i]*mul;
                 mul--;
            }
            else ans += nums[i];
        }
        return ans;
    }
}