// Leetcode 1302 DeepestLeavesSum in java solution beats 100% of solution

// Step 1 -> first we have to find the depth of binary tree.

// Step 2 -> After finding depth of binary tree. we use DFS and check if current level is equals to depth then we add the current value;

class Solution {
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {

        int depth=maxDepth(root); // use to get the maximum depth of tree.
       
        findsum(root,1,depth);    // to find the sum at max_Depth.
       
        return sum;   //returning sum
     }
    
      public int maxDepth(TreeNode root)
    
{
         if(root==null)
            return 0;
     
     int left=maxDepth(root.left);
    
     int right=maxDepth(root.right);

     return Math.max(left,right)+1;
}
    public void findsum(TreeNode root,int dep,int depth)
    
{
        if(root==null)
            return;

        if(root!=null)

        {
            if(dep==depth)

            {

                sum+=root.val;// if current level is equals to depth than we add the root value;

            }
        
                    findsum(root.left,dep+1,depth);  // traversing left subtree
        
    findsum(root.right,dep+1,depth); // traversing right subtree
        
    }
    
}
}