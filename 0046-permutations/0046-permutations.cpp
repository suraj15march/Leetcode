class Solution {
public:
    void backtrack(vector<int>& nums, vector<int> &list, vector<bool> &vis, vector<vector<int>>&ans){
        if(list.size() == nums.size()){
            ans.push_back(list);
            return;
        }
        for(int i=0; i<nums.size(); i++){
            if(vis[i] == true) continue;
            vis[i] = true;
            list.push_back(nums[i]);
            backtrack(nums,list,vis,ans);
            vis[i] = false;
            list.pop_back();
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        vector<bool>vis(nums.size(), false);
        vector<int>list;
        backtrack(nums,list,vis,result);
        return result;
    }
};