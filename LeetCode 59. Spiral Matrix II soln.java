// LeetCode 59. Spiral Matrix II soln. in java

class Solution {
    public int[][] generateMatrix(int n) {
        
        int [][] mat=new int[n][n];
        int val=1;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(val<=n*n)
        {
            for(int i=left;i<=right;i++)
            {
                mat[top][i]=val++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                mat[i][right]=val++;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                mat[bottom][i]=val++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                mat[i][left]=val++;
            }
            left++;
        }
        
        
        return mat;
    
    }

}