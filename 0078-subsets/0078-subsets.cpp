class Solution {
    vector<vector<int>>ans;
public:
    void solve(vector<int>op,vector<int>nums){
        if(nums.empty()){
            ans.push_back(op);
            return;
        }
        vector<int>op1 = op;
        vector<int>op2 = op;
        op2.push_back(nums[nums.size()-1]);
        nums.pop_back();
        solve(op1,nums);
        solve(op2,nums);
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<int>op;
        solve(op,nums);
        return ans;
    }
};