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
    int countNodes(TreeNode* root) {
        if(root == NULL) return 0;
        TreeNode* l = root->left;
        TreeNode* r = root->right;
        int lNodes = 1, rNodes = 1;
        while(l){
            lNodes ++;
            l = l->left;
        }
        while(r){
            rNodes ++;
            r = r->right;
        }
        if(lNodes == rNodes)
            return pow(2,lNodes)-1;
        return 1+countNodes(root->left)+countNodes(root->right);
    }
};