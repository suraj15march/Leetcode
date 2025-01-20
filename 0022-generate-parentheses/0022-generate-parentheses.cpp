class Solution {
public:
    void func(int left, int right, string ans, vector<string>&res){
        if(left==0 && right == 0)
            {
                res.push_back(ans);
            }
        if(left>0){
            // ans += '(';
            func(left-1, right, ans+"(", res);
        }
        if(left<right && right>0){
            // ans += ')';
            func(left, right-1, ans+")", res);
        }
    }
    vector<string> generateParenthesis(int n) {
        int left = n, right = n;
        vector<string> res;
        string ans = "";
        func(left, right, ans, res);
        return res;
    }
};