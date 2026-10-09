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
    public void func(List<String>ans, StringBuilder sb, TreeNode root){
        if(root == null) return;
        String temp = Integer.toString(root.val);
        int n = temp.length();
        if(root.left == null && root.right == null){
            sb.append(temp);
            ans.add(new StringBuilder(sb).toString());
            sb.delete(sb.length()-n, sb.length());
            return;
        }
        sb.append(temp);
        sb.append("->");
        func(ans, sb, root.left);
        func(ans, sb, root.right);
        sb.delete(sb.length()-n, sb.length());
        sb.delete(sb.length()-2, sb.length());
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans = new ArrayList<>();
        if(root == null) return ans;
        StringBuilder sb = new StringBuilder();
        func(ans, sb, root);
        return ans;
    }
}