// LeetCode 733. Flood Fill solution in java.

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
               // image[sr][sc]=newColor;
                flood(image,sr,sc,newColor,image[sr][sc]);
              //  break;
        
        return image;
    }
    public void flood(int [][]image,int sr,int sc,int newclr,int oldclr)
    {
        
        if(sr>=image.length || sc>=image[0].length || sr<0 || sc<0  || image[sr][sc]==newclr ||image[sr][sc]!=oldclr)
            return ;
        image[sr][sc]=newclr;
        flood(image,sr+1,sc,newclr,oldclr);
        flood(image,sr,sc+1,newclr,oldclr);
        flood(image,sr-1,sc,newclr,oldclr);
        flood(image,sr,sc-1,newclr,oldclr);
        
    }
    
}