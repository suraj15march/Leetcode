class Solution {
    public int bSearchLeft(int[] nums, int left, int right, int target) {
        if(left > right) return -1;
        int mid = (left + right)/2;
        if(nums[mid] == target) {
            int index = bSearchLeft(nums, left, mid-1, target);
            return (index == -1)? mid: index;
        }
        if(target < nums[mid]) return bSearchLeft(nums, left, mid-1, target);
        return bSearchLeft(nums, mid+1, right, target);
    }
    public int bSearchRight(int[] nums, int left, int right, int target) {
        if(left > right) return -1;
        int mid = (left + right)/2;
        if(nums[mid] == target) {
            int index = bSearchRight(nums, mid+1, right, target);
            return (index == -1)? mid: index;
        }
        if(target < nums[mid]) return bSearchRight(nums, left, mid-1, target);
        return bSearchRight(nums, mid+1, right, target);
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = bSearchLeft(nums, 0, n-1, target);
        int right = bSearchRight(nums, 0, n-1, target);
        return new int[] {left, right};
    }
}