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
    public int diameterOfBinaryTree(TreeNode root) {

        int[] diameter = new int[1];
        diameterLogic(root, diameter);

        return diameter[0];        
    }

    private static int diameterLogic(TreeNode node, int[] max) {

        if(node == null) return 0;

        int lh = diameterLogic(node.left, max);
        int rh = diameterLogic(node.right, max);

        max[0] = Math.max(max[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }
}
