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
public:
    void solve(TreeNode* root, int t, int sum, bool &ans){
        if(root == NULL) return;
        sum += root->val;
        if(root->left == NULL && root->right == NULL) {
            if(sum == t){
                ans = true;
                return;
            }
        }
        solve(root->left, t, sum, ans);
        solve(root->right, t, sum, ans);
    }
    bool hasPathSum(TreeNode* root, int t) {
        if(root == NULL) return false;
        bool ans = false;
        solve(root, t, 0, ans);
        return ans;
    }
};