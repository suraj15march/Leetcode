class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length, minEle = nums[0];
        int sum = 0;
        for(int num: nums){ 
            minEle = Math.min(minEle, num);
            sum += num;
        }
        return sum-n*minEle;
    }
}