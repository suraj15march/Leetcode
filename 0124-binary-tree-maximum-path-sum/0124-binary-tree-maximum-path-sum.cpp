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
    int res = INT_MIN;
public:
    int solve(TreeNode* root){
        if(root == NULL) return 0;
        int l = solve(root->left);
        int r = solve(root->right);
        int temp = max(root->val, root->val + max(l,r));
        res = max(res, max(temp, l+r+root->val));
        // res = max(res,ans);
        return temp;
    }
    int maxPathSum(TreeNode* root) {
        solve(root);
        return res;
    }
};