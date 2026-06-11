class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int valueDiff) {
        TreeSet<Integer> t = new TreeSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(t.floor(nums[i])!=null && (nums[i] - t.floor(nums[i]) <= valueDiff)) return true;
            if(t.ceiling(nums[i])!=null && (t.ceiling(nums[i]) - nums[i] <= valueDiff)) return true;
            t.add(nums[i]);
            if(t.size()>k) t.remove(nums[i-k]);
        }
        return false;
    }
}