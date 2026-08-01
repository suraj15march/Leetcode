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
    List<Integer>list = new ArrayList<>();
    int ans = Integer.MAX_VALUE;
    void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        list.add(root.val);
        if(list.size()>1){
            ans = Math.min(ans, list.get(list.size()-1)-list.get(list.size()-2));
        }
        helper(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return ans;
    }
}