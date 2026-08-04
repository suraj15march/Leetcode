/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    void preorder(TreeNode root, int low, int high) {
        if(root == null) return;
        if(root.val>= low && root.val<=high)
            ans += root.val;
        preorder(root.left, low, high);
        preorder(root.right, low, high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        preorder(root, low, high);
        return ans;
    }
}