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
    void solve(TreeNode* root, int &ans, int max_tree){
        if(root == NULL) return;
        if(root->val >= max_tree){
            ans++;
            max_tree = root->val;
        }
        solve(root->left, ans, max_tree);
        solve(root->right, ans, max_tree);
    }
    int goodNodes(TreeNode* root) {
        if(root == NULL) return 0;
        int ans = 0;
        int max_tree = INT_MIN;
        solve(root, ans, max_tree);
        return ans;
    }
};