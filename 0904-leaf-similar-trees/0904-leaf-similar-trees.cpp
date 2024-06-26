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
    bool isLeaf(TreeNode* root){
        if(root->left == NULL && root->right == NULL)
            return true;
        return false;
    }
    void getLeafNodes(TreeNode* root, vector<int>&v){
        if(root == NULL) return;
        if(isLeaf(root)){
            v.push_back(root->val);
        }
        getLeafNodes(root->left, v);
        getLeafNodes(root->right, v);
    }
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> v1, v2;
        getLeafNodes(root1, v1);
        getLeafNodes(root2, v2);
        return v1 == v2;
    }
};