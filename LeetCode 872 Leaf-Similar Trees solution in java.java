// LeetCode 872 Leaf-Similar Trees solution in java using DFS

//Steps -> |
           V

//step 1 -> Initialise two list for two different trees;

//step 2 -> Add leaves of first tree and second tree in List1 and List2 respectively.

// return List1.equals(List2).  

 

class Solution {
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    
  // Initialising lists.
    List<Integer> list1=new ArrayList<>(); 
    
    List<Integer> list2=new ArrayList<>();
    
  // DFS traversal for tree1.
     
        dfs(list1,root1);
     
  // DFS traversal for tree2

        dfs(list2,root2);

 // Compairing and returning boolean value.

        return list1.equals(list2);
    }
    public void dfs(List<Integer> list,TreeNode root)
    {
        if(root==null) // if root is null we return.
            return;
        if(root.left==null && root.right==null) // if current node is leaf.
        {
            list.add(root.val);     // adding it to the list.
        }
        dfs(list,root.left);    //traversing left of tree.

        dfs(list,root.right);   //traversing right of tree.
    }
}