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
    bool ans = true;
public:
    void check(TreeNode* p, TreeNode* q){
        if(!p && !q) {
            return;
        }
        if((!p && q) || (p && !q)) {
            ans = false;
            return;
        }
        check(p->left, q->right);
        check(p->right, q->left);
        if(p && q){
            if(p->val != q->val)
                ans = false;
        }
    }
    bool isSymmetric(TreeNode* root) {
        if(root == NULL) return true;
        check(root->left, root->right);
        return ans;
    }
};