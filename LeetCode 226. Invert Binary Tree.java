// LeetCode 226. Invert Binary Tree solution in Java beats 100% of solutions.


class Solution {
    public TreeNode invertTree(TreeNode root) {
        return helper(root); // Calling helper function and returning the root returned by helper function.
        
        
    }
    public TreeNode helper(TreeNode root)
    {
        if(root==null)   // if we found root is null we simply return null.
            return null;
        
       
        helper(root.left); // traversing into left subtree of current tree.
       
        helper(root.right);  // traversing into Right subtree of current tree.
        
        TreeNode temp=root.left;   // Swapping root fron left to right OR vice-versa using temp variable.
        
        root.left=root.right;
        
        root.right=temp;
        
        return root;      //returning root of tree.
    }
}