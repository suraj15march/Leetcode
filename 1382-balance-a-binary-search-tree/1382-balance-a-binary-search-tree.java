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
    List<Integer>list;
    void preOrder(TreeNode root){
        if(root == null) return;
        preOrder(root.left);
        list.add(root.val);
        preOrder(root.right);
    }
    TreeNode buildBST(List<Integer>list, int low, int high){
        if(low>high) return null;
        int mid  = low+(high-low)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildBST(list, low, mid-1);
        root.right = buildBST(list, mid+1, high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        list = new ArrayList<>();
        preOrder(root);
        return buildBST(list, 0, list.size()-1);
    }
}