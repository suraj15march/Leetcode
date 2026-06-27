class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE, n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i=1; i<n; i++)  prefixSum[i] = nums[i]+prefixSum[i-1];
        if(prefixSum[n-1]<target) return 0;
        int i=0, j=0;
        while(j<n){
            if(prefixSum[j]>=target){
                ans = Math.min(ans,j+1);
                while(prefixSum[j]-prefixSum[i]>=target && i<j){
                    ans = Math.min(ans,j-i);
                    i++;
                }
                
            }
            j++;
        }
        return ans;
    }
}