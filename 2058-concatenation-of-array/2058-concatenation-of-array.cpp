class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> ans = nums;
        for(int it : nums)
            ans.push_back(it);
        return ans;
    }
};