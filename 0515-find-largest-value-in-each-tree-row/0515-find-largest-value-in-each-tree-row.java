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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if(root == null)
            return ls;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(q.isEmpty() == false){
            List<Integer> l = new ArrayList<>();
            int count = q.size();
            for(int i=0;i<count;i++)
            {
                TreeNode current = q.poll();
                l.add(current.val);
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);   
            }
            ls.add(Collections.max(l));
        }
        return ls;
        
    }
}