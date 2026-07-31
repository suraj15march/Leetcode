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
        if(root.left == null && root.right == null && sum+root.val==targetSum){
            list.add(root.val);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        if(root.left != null){
            list.add(root.val);
            helper(root.left, targetSum, sum+root.val, ans, list);
            list.remove(list.size()-1);
        }
        if(root.right != null){
            list.add(root.val);
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