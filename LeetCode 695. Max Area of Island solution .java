// LeetCode 695. Max Area of Island solution in java.

class Solution {
   
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                int  count=-1;
                if(grid[i][j]==1)
                {  count=0;
                    count=dfs(grid,i,j);
                    max=Math.max(count,max);
                }
            }
        }
        return max;
        
    }
    public int dfs(int[][] grid,int i,int j)
    {
        if(i<0 || j<0 ||i>=grid.length||j>=grid[0].length || grid[i][j]!=1)
            return 0;
        grid[i][j]=-1;
       int result = 1;
        
        result= result + dfs(grid,i-1,j)+
            dfs(grid,i+1,j)+
            dfs(grid,i,j-1)+
            dfs(grid,i,j+1);
        return result;
        
    }
}
