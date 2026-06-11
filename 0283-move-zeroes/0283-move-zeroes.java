class Solution {
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public void moveZeroes(int[] nums) {
        int i=0, j=0, n = nums.length;
        while(j<n){
            if(nums[j]!=0){
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }
}