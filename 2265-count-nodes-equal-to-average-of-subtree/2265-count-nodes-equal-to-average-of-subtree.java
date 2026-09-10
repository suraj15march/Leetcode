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
    int ans = 0;
    public Pair helper(TreeNode root) {
        if(root == null) return new Pair(0, 0);;
        Pair lp = helper(root.left);
        Pair rp = helper(root.right);
        int count = 1+lp.a+rp.a;
        int sum = root.val+lp.b+rp.b;

        if(sum/count == root.val) ans++;

        // System.out.print(root.val);
        // System.out.print(" ");
        // System.out.print(count);
        // System.out.print(" ");
        // System.out.print(sum);
        // System.out.println();
        return new Pair(count, sum);
    }
    public int averageOfSubtree(TreeNode root) {
        Pair pair = helper(root);
        return ans;
    }
}