class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            int temp = target - nums[i];
            if(mp.get(temp) == null){
                mp.put(nums[i], i);
            }
            else{
                ans[0] = i;
                ans[1] = mp.get(temp);
                return ans;
            }
        }
        return ans;
    }
}