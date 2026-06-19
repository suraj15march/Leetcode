class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-2;
        int ans = n+1;
        for(int i=n; i>=0; i--){
            if(i+nums[i]>=ans){
                ans = i;
            }
        }
        return ans == 0;
    }
}