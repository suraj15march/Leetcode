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
    int ans = 0;
public:
    void solve(TreeNode* root, int max_tree){
        if(!root) return;
        if(root->val >= max_tree){
            ans++;
            max_tree = root->val;
        }
        solve(root->left, max_tree);
        solve(root->right, max_tree);
    }
    int goodNodes(TreeNode* root) {
        int max_tree = INT_MIN;
        solve(root, max_tree);
        return ans;
    }
};