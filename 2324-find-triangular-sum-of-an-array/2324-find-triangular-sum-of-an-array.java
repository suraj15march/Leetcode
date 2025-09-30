class Solution {
    private void func(int[] nums, int n){
        if(n<=1) return;
        for(int i=1; i<n; i++){
            nums[i-1] = (nums[i-1]+nums[i])%10;
        }
        func(nums, n-1);
    }
    public int triangularSum(int[] nums) {
        int n = nums.length;
        func(nums, n);
        return nums[0];
    }
}