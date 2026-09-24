class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1) return n;
        int count = 1, ans = 1;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            if(nums[i-1] == nums[i]) continue;
            if(nums[i-1]+1 == nums[i]) count++;
            else count = 1;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}