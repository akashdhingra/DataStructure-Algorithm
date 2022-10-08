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
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> l1 = new ArrayList<Integer>();
        
//         if(root.left!=null)
//             inorderTraversal(root.left);
//         l1.add(root.val);
//         if(root.right!=null)
//             inorderTraversal(root.right);
          
//         return l1;
//     }
// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(res,root);
        return res;
    }
    
    private void inorder(List<Integer> res, TreeNode root){
        if(root == null) return;
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }
}