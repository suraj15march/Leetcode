class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, n = nums.length;
        for(int num: nums){
            if(num != 0){
                nums[left++] = num;
            }
        }
        while(left < n){
            nums[left++] = 0;
        }
    }
}