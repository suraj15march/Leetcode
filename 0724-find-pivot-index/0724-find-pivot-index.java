class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, s = 0;
        for(int i:nums) sum += i;
        for(int i=0; i<nums.length; i++){
            if(2*s+nums[i] == sum) return i;
            s += nums[i];
        }
        return -1;
    }
}