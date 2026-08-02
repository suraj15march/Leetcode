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
    Map<Integer, Integer> map = new HashMap<>();
    int index;

    TreeNode helper(int[] postorder, int start, int end) {
        if (start > end || index < 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[index]);
        int m = map.get(postorder[index]);
        index--;
        root.right = helper(postorder, m + 1, end);
        root.left = helper(postorder, start, m - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        if (n == 0) {
            return null;
        }
        index = n - 1;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return helper(postorder, 0, n - 1);
    }
}