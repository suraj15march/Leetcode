/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    vector<vector<int>>ans;
public:
    void solve(TreeNode* root, vector<int>v, int sum, int &t){
        if(root == NULL) return;
        v.push_back(root->val);
        sum += root->val;
        if(root->left == NULL && root->right == NULL){
            if(sum == t)    ans.push_back(v);
        }
        solve(root->left, v, sum, t);
        solve(root->right, v, sum, t);
    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        if(root == NULL) return {};
        solve(root, {}, 0, targetSum);
        return ans;
    }
};