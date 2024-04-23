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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return cTree(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }
    
    private TreeNode cTree(int[] inorder, int[] postorder, int istart, int iend, int pstart, int pend){
        if(istart > iend){
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[pend]);
        if(istart==iend){
            return root;
        }
        
        int index = 0;
        
        for(int i=istart;i<=iend;i++){
            if(inorder[i] == root.val){
                index = i;
                break;
            }
        }
        
        root.left = cTree(inorder, postorder, istart, index-1, pstart, pstart-istart+index-1);
        root.right = cTree(inorder, postorder, index+1,iend, pend-iend+index, pend-1);
        
        return root;
    }
}