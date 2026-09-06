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
    int helper(TreeNode root, Map<TreeNode, Integer>map) {
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int money = root.val;
        if(root.left != null){
            money += helper(root.left.left, map) + helper(root.left.right, map);
        }
        if(root.right != null){
            money += helper(root.right.left, map) + helper(root.right.right, map);
        }
        int skip = helper(root.left, map) + helper(root.right, map);
        map.put(root, Math.max(money, skip));
        return map.get(root);
    }
    public int rob(TreeNode root) {
        Map<TreeNode, Integer>map = new HashMap<>();
        return helper(root, map);
    }
}