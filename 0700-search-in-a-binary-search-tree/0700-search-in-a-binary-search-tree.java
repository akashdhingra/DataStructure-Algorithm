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

// If value is greater than root.val then traverse left 
// If value is less than root.val then traverse right 
// when value is equal, then return root;
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        else if(root.val > val)
            return searchBST(root.left,val);
        else if(root.val < val)
            return searchBST(root.right,val);
        else
            return root;
    }
}