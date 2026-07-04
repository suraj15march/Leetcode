class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int count = 0;
            int num = nums[i];
            for(int it:nums){
                if(num>it) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}