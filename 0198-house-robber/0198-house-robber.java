class Solution {
    private int[] ans;
    private int func(int[] nums, int index){
        int n = nums.length;
        if(index>=n) return 0;
        if(ans[index] != -1) return ans[index];
        ans[index] = Math.max(nums[index]+func(nums, index+2), func(nums,index+1));
        return ans[index];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        ans = new int[n];
        Arrays.fill(ans, -1);
        return func(nums,0);
    }
}