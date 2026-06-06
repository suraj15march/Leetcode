class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero = 0, one = 0, two = n-1;
        while(one<=two){
            if(nums[one] == 0){
                swap(nums, one, zero);
                zero++;
                one++;
            }
            else if(nums[one] == 1){
                one++;
            }
            else {
                swap(nums, one,two);
                two--;
            }
        }
    }
}