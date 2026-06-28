class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long val = 0;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            if(mul>1){
                val += (long) nums[i] * mul;;
            }else{
                val += nums[i];
            }
            mul--;
            
        }
        return val;
    }
}