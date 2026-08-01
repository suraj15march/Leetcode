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
    int temp = -1;
    int ans = Integer.MAX_VALUE;
    void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(temp != -1){
            ans = Math.min(ans, root.val-temp);
        }
        temp = root.val;
        helper(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return ans;
    }
}