class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<>();
        int i=0, j=0, n = nums.length, ans=0;
        while(i<=j && j<n){
            map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
            while(map.get(nums[j])>k && i<j){
                map.put(nums[i], map.get(nums[i])-1);
                i++;
            }
            j++;
            ans = Math.max(ans, j-i);
        }
        return ans;
    }
}