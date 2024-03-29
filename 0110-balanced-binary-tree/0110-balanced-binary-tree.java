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

// Get the height of left and right subtrees using dfs traversal. Return true if the // difference between heights is not more than 1 and left and right subtrees are 
// balanced, otherwise return false. 

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        int l = height(root.left);
        int r = height(root.right);
        
        if(Math.abs(l-r) <=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        else
            return false;
        
    }
    
    public int height(TreeNode root){
        if(root == null)
            return 0;
        else
            return 1+ Math.max(height(root.left),height(root.right));
    }
}