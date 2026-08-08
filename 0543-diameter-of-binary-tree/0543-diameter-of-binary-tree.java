class Solution {
    class Height {
    int h;
}
public int diameterOfBinaryTree(TreeNode root) {
if (root == null)
return 0;
return diameter(root,new Height());
 }

    public int diameter(TreeNode root, Height ht) {
        if (root == null)
            return 0;
        Height lh = new Height();
        Height rh = new Height();
        int ldiameter = diameter(root.left, lh);
        int rdiameter = diameter(root.right, rh);
        ht.h = 1 + Math.max(lh.h, rh.h);
        return Math.max(lh.h + rh.h, Math.max(ldiameter, rdiameter));
    }
}