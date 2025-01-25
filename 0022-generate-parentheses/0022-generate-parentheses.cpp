class Solution {
public:
    void func(int left, int right, vector<string>&ans, string res){
        if(left==0 && right == 0){
            ans.push_back(res);
        }
        if(left>0){
            func(left-1, right, ans, res+'(');
        }
        if(right>0 && left<right){
            func(left, right-1, ans, res+')');
        }
    }
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        string res = "";
        func(n, n, ans, res);
        return ans;
    }
};