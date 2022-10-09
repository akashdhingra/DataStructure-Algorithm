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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        pre_order(arr,root);
        return arr;
        
    }
    
    public void pre_order(List<Integer> arr, TreeNode root)
    {
        if(root==null) return;
        arr.add(root.val);
        pre_order(arr,root.left);
        pre_order(arr,root.right);
    }
}