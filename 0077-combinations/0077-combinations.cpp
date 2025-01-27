class Solution {
public:
    void backtrack(vector<vector<int>>&ans, vector<int>list, int n, int k, int index){
        if(list.size()==k){
            ans.push_back(list);
            return;
        }
        for(int i=index; i<=n; i++){
            list.push_back(i);
            backtrack(ans, list, n, k, i+1);
            list.pop_back();
        }
    }
    vector<vector<int>> combine(int n, int k) {
        vector<vector<int>>ans;
        vector<int>list;
        backtrack(ans, list, n, k, 1);
        return ans;
    }
};