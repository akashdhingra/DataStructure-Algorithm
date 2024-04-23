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
    
    int preIndex = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return cTree(preorder,inorder,0,preorder.length-1);
    }
    
    private TreeNode cTree(int[] preorder, int[] inorder, int start, int end){
        
        if(start>end){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(start==end){
            return root;
        }
        
        int index = 0;
        for(int i=start;i<=end;i++){
            if(inorder[i] == root.val){
                index = i;
                break;
            }
        }
        
        root.left = cTree(preorder, inorder, start, index-1);
        root.right = cTree(preorder, inorder, index+1, end);
        
        return root;
        
    }
}