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

// Below solution is a naive Approach
// Approach is that, first find the height of tree
// After that print the value of a tree from node to height
// i.e starting from 0 to height [same as print the value from node to height k]
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int h = height(root);
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<h;i++)
        {
            List<Integer> list = new ArrayList<>();
            l.add(kDistance(root,list ,i));
        }
        return l;
        
    }
    
    public List<Integer> kDistance(TreeNode root, List<Integer> list ,int k)
    {
        if(root==null)
            return list;
        if(k==0)
            list.add(root.val);
        else
        {
            kDistance(root.left,list,k-1);
            kDistance(root.right,list,k-1);
        }
        return list;
    }
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
}