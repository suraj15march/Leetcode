class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 0, count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]) count++;
            else{
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans, count);
        count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]) count++;
            else{
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans, count);

        return ans;
    }
}