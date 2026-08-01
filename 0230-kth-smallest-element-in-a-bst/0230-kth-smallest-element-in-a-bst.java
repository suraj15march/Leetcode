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
    void helper(TreeNode root, int k){
        if(root == null) return;
        helper(root.left, k);
        list.add(root.val);
        if(list.size() == k) return;
        helper(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return list.get(k-1);
    }
}