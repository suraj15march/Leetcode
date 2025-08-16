class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = 0, n = nums.length;
        while(left <= right && right<n){
            if(nums[left] == val && nums[right]!=val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            else if(nums[left] != val && nums[right]!=val){
                left++;
                right++;
            }
            else if(nums[left] == val && nums[right]==val){
                right++;
            }
        }
        return left;
    }
}