// LeetCode 653. Two Sum IV - Input is a BST in Java


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
   HashSet<Integer> set=new HashSet<Integer>(); // Defining Set to store BST NODE Value.
    public boolean findTarget(TreeNode root, int k) {
      if(root==null)                   // if it's null we return false.
            return false;
        
          if(set.contains(k-root.val))   // if Set already contains value which is equal to (current node value) + (stored value) = k. we return true.
             return true;
             else
             {
                 set.add(root.val);     // Else we simply add this this value in hashSet.
             }
     
        return findTarget(root.left,k) || findTarget(root.right,k);  // Traversing Right and Left of BST and checking upper condition repeatitively.
       
        
        
    }
   
    
}