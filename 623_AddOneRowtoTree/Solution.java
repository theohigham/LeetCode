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
            TreeNode original = root;
            
            root = new TreeNode(val);
            root.left = original;
        }
        
        search(root, 1, val, depth);
        
        return root;
        
    }

    public static void search(TreeNode node, int level, int val, int depth) {

        if (node != null) {
            System.out.println("Value: " + node.val + " Level: " + level);
            
            if (level == depth-1) {
                System.out.println("*Appending*");
                node = appendNodesTo(node, val);
            }
            
            search(node.left, level + 1, val, depth);
            search(node.right, level + 1, val, depth);
        }
    }
  
    public static TreeNode appendNodesTo(TreeNode node, int val) {
        // Appends nodes of value val underneath node

        TreeNode tempLeft = node.left;
        TreeNode tempRight = node.right;

        TreeNode newLeft = new TreeNode(val);
        newLeft.left = tempLeft;

        TreeNode newRight = new TreeNode(val);
        newRight.right = tempRight;

        node.left = newLeft;
        node.right = newRight;

        return node;

    }
    
}