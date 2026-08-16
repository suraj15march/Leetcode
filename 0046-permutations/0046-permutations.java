class Solution {
    List<List<Integer>>ans;
    void helper(int[] nums, int index, List<Integer>list){
        int n = nums.length;
        if(index>=n){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0; i<n; i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            helper(nums, index+1, list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>());
        return ans;
    }
}