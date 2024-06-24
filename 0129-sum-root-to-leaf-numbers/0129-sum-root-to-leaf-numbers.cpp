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
    int sum = 0;
public:
    void solve(TreeNode* root, int num){
        if(root == NULL) {
            return;
        }
        num *= 10;
        num += root->val;
        if(root->left == NULL && root->right == NULL){
            cout<<num<<endl;
            sum += num;
        }
        solve(root->left, num);
        solve(root->right, num);
    }
    int sumNumbers(TreeNode* root) {
        vector<int>nums;
        solve(root, 0);
        return sum;
    }
};