class Solution {
    private int bSearch(int[] nums, int target, int left, int right){
        int mid = left+(right-left)/2;
        if(left>right) return -1;
        if(nums[mid] == target) return mid;
        else if(nums[mid]>target)
            return bSearch(nums, target, left, mid-1);
        return bSearch(nums, target, mid+1, right);
    }
    public int search(int[] nums, int target) {
        // int start = 0, end = nums.length-1;
        // while(start<=end){
        //     int mid = (end+start)/2;
        //     if(nums[mid] == target) return mid;
        //     else if(target < nums[mid]) end = mid-1;
        //     else start = mid+1;
        // }
        // return -1;
        return bSearch(nums, target, 0, nums.length-1);
    }
}