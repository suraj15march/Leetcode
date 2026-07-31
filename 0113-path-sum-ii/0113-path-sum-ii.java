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
    public void helper(TreeNode root, int targetSum, int sum, List<List<Integer>>ans, List<Integer>list) {
        if(root == null) return;
        list.add(root.val);
        if(root.left == null && root.right == null && sum+root.val==targetSum){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(root.left != null){
            helper(root.left, targetSum, sum+root.val, ans, list);
            list.remove(list.size()-1);
        }
        if(root.right != null){
            helper(root.right, targetSum, sum+root.val, ans, list);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans = new ArrayList<>();
        helper(root, targetSum, 0, ans, new ArrayList<>());
        return ans;
    }
}