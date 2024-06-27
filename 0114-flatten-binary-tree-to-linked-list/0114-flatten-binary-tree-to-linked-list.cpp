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
    TreeNode* solve(TreeNode* root){
        if(root == NULL || (root->left == NULL && root->right == NULL)) return root;

        TreeNode* leftTree = solve(root->left);
        TreeNode* rightTree = solve(root->right);
        
        if(leftTree){
            leftTree->right = root->right;
            root->right = root->left;
            root->left = NULL;
        }
        if(rightTree) return rightTree;
        return leftTree;
        // return root;
    }
    void flatten(TreeNode* root) {
        solve(root);
    }
};