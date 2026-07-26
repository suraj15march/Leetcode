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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>result  = new ArrayList<>();
        if(root == null) return result;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        Boolean isReverse = false;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
                if(!queue.isEmpty()) queue.offer(null);
                if(isReverse) Collections.reverse(list);
                isReverse = !isReverse;
                result.add(list);
                list = new ArrayList();
                continue;
            }
            list.add(node.val);
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
        }
        return result;
    }
}