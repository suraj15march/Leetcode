class Solution {
public:
    void backtrack(vector<vector<int>>&ans, vector<int>list, vector<int>& nums, int index){
        ans.push_back(list);
        for(int i=index;i<nums.size();i++){
            if (i > index && nums[i] == nums[i - 1]) continue;
            list.push_back(nums[i]);
            backtrack(ans, list, nums, i+1);
            list.pop_back();
        }
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>>ans;
        vector<int> list;
        sort(nums.begin(),nums.end());
        backtrack(ans, list, nums, 0);        
        return ans;
    }
};