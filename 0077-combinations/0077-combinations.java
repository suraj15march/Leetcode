class Solution {
    List<List<Integer>>ans;
    void helper(int index, int n, int k, List<Integer>list){
        if(index>n){
            return;
        }
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<n; i++){
            list.add(i+1);
            helper(i+1, n, k, list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        helper(0, n, k, new ArrayList<>());
        return ans;
    }
}