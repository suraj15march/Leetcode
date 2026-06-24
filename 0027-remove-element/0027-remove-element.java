class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, h = 0;
        while(h<nums.length){
            if(nums[h] != val){
                nums[l] = nums[h];
                l++;
            }
            h++;
        }
        return l;
    }
}