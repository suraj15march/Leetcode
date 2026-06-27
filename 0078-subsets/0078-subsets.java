class Solution {
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer>list, int idx){
        if(idx == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        helper(nums, ans, list, idx+1);
        list.remove(list.size()-1);
        helper(nums, ans, list, idx+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
}