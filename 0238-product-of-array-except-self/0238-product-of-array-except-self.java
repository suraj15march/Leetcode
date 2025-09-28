class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, n = nums.length, zeroCount = 0, zeroIndex = -1;
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++){
            if(nums[i] == 0) {
                zeroCount ++;
                zeroIndex = i;
                continue;
            }
            product *= nums[i];
        }
        if(zeroCount>1) return ans;
        if(zeroCount == 1) {
            ans[zeroIndex] = product;
            return ans;
        }
        for(int i=0; i<n; i++){
            ans[i] = product/nums[i];
        }
        return ans;
    }
}