class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        for(int i= nums.length-1; i>= nums.length-k; i--){
            if(mul>1) ans += (long) nums[i]*mul;
            else ans += nums[i];
            mul--;
        }
        return ans;
    }
}