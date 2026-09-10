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
 class Pair{
    int a;
    int b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
 }
class Solution {
    public Pair helper(TreeNode root, int[] ans) {
        if(root == null) return new Pair(0, 0);
        Pair lp = helper(root.left, ans);
        Pair rp = helper(root.right, ans);
        int count = 1+lp.a+rp.a;
        int sum = root.val+lp.b+rp.b;

        if(sum/count == root.val) ans[0]++;

        return new Pair(count, sum);
    }
    public int averageOfSubtree(TreeNode root) {
        int[] ans = new int[1];
        Pair pair = helper(root, ans);
        return ans[0];
    }
}