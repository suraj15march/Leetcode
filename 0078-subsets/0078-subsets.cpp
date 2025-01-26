class Solution {
public:
    void backtrack(vector<vector<int>>&ans, vector<int>& nums, int start, vector<int>&list){
        // if(start>list.size()){
            ans.push_back(list);
            // return;
        // }
        for(int i=start;i<nums.size();i++){
            list.push_back(nums[i]);
            backtrack(ans,nums,i+1,list);
            list.pop_back();
        }
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>>ans;
        vector<int>list;
        backtrack(ans,nums,0,list);
        return ans;
    }
};