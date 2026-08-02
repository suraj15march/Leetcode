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
    Map<Integer, Integer>map = new HashMap<>();
    int index = 0;
    TreeNode helper(int[] preorder, int l, int h){
        if(l>h) return null;

        int m = map.get(preorder[index]);
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        root.left = helper(preorder, l, m-1);
        root.right = helper(preorder, m+1, h);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if(n==0) return null;
        for(int i=0; i<n; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, n-1);
    }
}