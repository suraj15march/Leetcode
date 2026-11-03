class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, maxEle = nums[0], n = nums.length;
        for(int num: nums){
            sum += num;
            maxEle = Math.max(num, maxEle);
        }
        return n*maxEle - sum;
    }
}