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
    int ans = Integer.MIN_VALUE;
    int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int curSum = Math.max(root.val, Math.max(root.val+left, root.val+right));
        ans = Math.max(ans, Math.max(curSum, root.val+left+right));
        return curSum;
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
}