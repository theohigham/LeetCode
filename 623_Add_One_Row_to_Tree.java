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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if (depth == 1) {
            TreeNode tree = new TreeNode(val);
        }
     
        TreeNode tempLeft = root.left;
        TreeNode tempRight = root.right;
        
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        
        root.left.left = tempLeft;
        root.right.right = tempRight;
        
    return root;
        
    }
}