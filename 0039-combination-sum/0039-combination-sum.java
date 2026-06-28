class Solution {
    private void helper(List<List<Integer>>ans, List<Integer>list, int index, int sum, int[] candidates, int target){
        if(sum == target){
            ans.add(new ArrayList(list));
            sum = 0;
            return;
        }
        if(sum>target){
            list = new ArrayList();
            sum = 0;
            return;
        }
        if(index == candidates.length) return;
        sum += candidates[index];
        list.add(candidates[index]);
        helper(ans, list, index, sum, candidates, target);
        list.remove(list.size()-1);
        sum -= candidates[index];
        helper(ans, list, index+1, sum, candidates, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList();
        int n = candidates.length;
        helper(ans, new ArrayList(), 0, 0, candidates, target);
        return ans;
    }
}