class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero = 0, i = 0, two = n-1;
        while(i<=two){
            if(nums[i] == 0){
                swap(nums, i, zero);
                zero++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else {
                swap(nums, i,two);
                two--;
            }
        }
    }
}