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
        int n = nums.length;
        int l = 0, h = n-1;
        while(l<h){
            int m = (l+h)/2;
            if(nums[m]>nums[h]) {
                l=m+1;
            }
            else h=m;
        }
        return Math.max(bSearch(nums, target, 0, l-1), bSearch(nums, target, l, n-1));
    }
}