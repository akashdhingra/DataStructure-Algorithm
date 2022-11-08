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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        else if(root.val > key)
            root.left = deleteNode(root.left, key);
        else if(root.val < key)
            root.right = deleteNode(root.right, key);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else{
                TreeNode succ = successor(root);
                root.val = succ.val;
                root.right = deleteNode(root.right,succ.val);
            }
        }
        return root;
    }
    
    // finding the next successor in a tree by using inorder
    // If we the value of key = root .val, which needs to be removed
    // then we can either replace the root with nearest small or greater value
    // and in this we choose to replace it with the greater value
    // It is an individual choice to do so.
    
    public TreeNode successor(TreeNode root){
        TreeNode current = root.right;
        while(current.left != null && current != null)
            current = current.left;
        
        return current;
    }
}