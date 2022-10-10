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
// Solution 1 --> When using inorder in separate function
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(res,root);
        return res;
    }
    
    public void inorder(List<Integer> res, TreeNode root){
        if(root == null) return;
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }
}


// Below solution does not works because after every recursion call
// new res is created and the result of recursion call is not stored any where
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         if(root == null) return res;
//         inorderTraversal(root.left);
//         res.add(root.val);
//         inorderTraversal(root.right);
        
//         return res;
//     }
    
// }


