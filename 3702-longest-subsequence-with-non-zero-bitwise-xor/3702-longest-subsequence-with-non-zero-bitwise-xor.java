class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length, xor=0;
        Boolean notZero = true;
        for(int i=0; i<n; i++){
            if(nums[i]!=0) notZero = false;
            xor = xor^nums[i];
        }
        return notZero?0:xor==0?n-1:n;
    }
}