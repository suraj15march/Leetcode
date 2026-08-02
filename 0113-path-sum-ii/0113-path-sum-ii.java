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
    List<List<Integer>>ans;
    void helper(TreeNode root, int targetSum, List<Integer>list){
        if(root == null) return;
        if(root.left == null && root.right==null && targetSum-root.val==0){
            list.add(root.val);
            ans.add(new ArrayList(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.val);
        helper(root.left, targetSum-root.val, list);
        helper(root.right, targetSum-root.val, list);
        if(list.size()>0) list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        if(root == null) return ans;
        helper(root, targetSum, new ArrayList());
        return ans;
    }
}