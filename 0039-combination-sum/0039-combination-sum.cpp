class Solution {
public:
    void backtrack(vector<vector<int>>&ans, vector<int>list, vector<int>& candidates, int index, int remain){
        // base condition
        if(remain<0) return;
        if(remain == 0){
            ans.push_back(list);
        }
        for(int i=index; i<candidates.size(); i++){
            list.push_back(candidates[i]);
            backtrack(ans, list, candidates, i, remain-candidates[i]);
            list.pop_back();
        }
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>>ans;
        vector<int>list;
        backtrack(ans,list,candidates,0,target);
        return ans;
    }
};