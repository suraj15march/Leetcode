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
    int leftheight(TreeNode root){
        if(root == null) return 0;
        return 1+leftheight(root.left);
    }
    int rightheight(TreeNode root){
        if(root == null) return 0;
        return 1+rightheight(root.right);
    }
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        if(leftheight(root) == rightheight(root)){
            return (int)Math.pow(2,leftheight(root))-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
