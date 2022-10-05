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
            return new TreeNode(val);
        }
     
        int level = 1;
        search(root.left);
        search(root.right);
        
        root = appendVal(root,val);
        
    return root;
        
    }
        
    public static void search(TreeNode node) {
        
        if (node != null) {
            
        //  appendVal(node, val);
            
        // else, keep seraching    
            
        search(node.left);
        search(node.right);
            
        }
            
    }
    
    public TreeNode appendVal(TreeNode node, int val) {
        TreeNode tempLeft = node.left;
        TreeNode tempRight = node.right;
        
        node.left = new TreeNode(val);
        node.right = new TreeNode(val);
        
        node.left.left = tempLeft;
        node.right.right = tempRight;
        
        return node;
    }
    
}