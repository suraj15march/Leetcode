class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, n = nums.length, ans = -1;
        if(n==1) return nums[0];
        ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == ans)
                count ++;
            else
                count --;
            if(count<=0){
                ans = nums[i];
                count = 1;
            }
        }
        return ans;
    }
}