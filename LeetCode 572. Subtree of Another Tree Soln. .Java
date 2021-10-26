// LeetCode 572. Subtree of Another Tree Soln. in Java

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(subRoot==null)
            return true;
        if(root==null)
            return false;
        if(check(root,subRoot))
            return true;
        return (isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot));
    }
    public boolean check(TreeNode p1,TreeNode p2)
    {
        if(p1==null && p2==null)
            return true;
        if(p1!=null && p2!=null)
        {
            if(p1.val==p2.val && check(p1.left,p2.left) && check(p1.right,p2.right))
                return true;
        }
        return false;
    }
}

