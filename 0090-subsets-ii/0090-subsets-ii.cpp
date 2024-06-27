class Solution {
    vector<vector<int>>ans;
    map<vector<int>, int> mp;
public:
    void solve(vector<int>nums, vector<int>op){
        sort(op.begin(), op.end());
        if(nums.empty()){
            if(!mp[op]){
                mp[op]++;
                ans.push_back(op);
            }
            return;
        }
        vector<int>op1 = op;
        vector<int>op2 = op;
        op2.push_back(nums[0]);
        nums.erase(nums.begin()+0);
        solve(nums, op1);
        solve(nums, op2);
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int>op;
        solve(nums, op);
        return ans;
    }
};