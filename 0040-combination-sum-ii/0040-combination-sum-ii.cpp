class Solution {
public:
    void backrack( vector<vector<int>>&ans, vector<int>list, vector<int>& candidates, int index, int remain){
        if(remain < 0) return;
        if(remain == 0) ans.push_back(list);
        for(int i=index; i<candidates.size(); i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            list.push_back(candidates[i]);
            backrack(ans, list, candidates, i+1, remain-candidates[i]);
            list.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>>ans;
        vector<int> list;
        sort(candidates.begin(), candidates.end());
        backrack(ans, list, candidates, 0, target);
        return ans;
    }
};