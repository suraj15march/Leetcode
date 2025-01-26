class Solution {
public:
    void backtrack(vector<vector<int>>&ans, vector<int>list,  vector<int>&vis, vector<int>&nums){
        //base condition
        if(list.size() == nums.size()){
            ans.push_back(list);
            return;
        }
        for(int i=0; i<nums.size(); i++){
            if(vis[i]) continue;
            if(i>0 && nums[i] == nums[i-1] && vis[i-1]==false) continue;
            vis[i] = true;
            list.push_back(nums[i]);
            backtrack(ans,list,vis,nums);
            vis[i] = false;
            list.pop_back();
        }
    }
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int>list;
        vector<int>vis(nums.size(),false);
        sort(nums.begin(), nums.end());
        backtrack(ans,list,vis,nums);
        return ans;
    }
};