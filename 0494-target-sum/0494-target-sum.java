class Solution {
    int subsetSum(int index, int target, int[] nums){
        if(index>=nums.length){
            if(target == 0) return 1;
            return 0;
        }
        return subsetSum(index+1, target-nums[index], nums) + subsetSum(index+1, target, nums);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num: nums) sum += num;
        if(target>sum || (sum+target)%2 !=0 ) return 0;
        int s1 = (sum+target)/2;
        return subsetSum(0, s1, nums);
    }
}