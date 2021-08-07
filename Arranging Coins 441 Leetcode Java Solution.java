// Arranging Coins LeetCode Solutions in Java in T.C (O(n),)(log n),(1))
// Video Solution Link(Hindi) -> https://youtu.be/_abVECnZJiY 
class Solution {
    public int arrangeCoins(int n) {
        // 0 (1)
         return (int)(Math.sqrt( 2* (long) n + 0.25)-0.5);
        
        // O(log n)
           int le=0;
           int ri=n;
           while(le<=ri)
           {
               long mid=le+(ri-le)/2;
           if(n>=(mid*(mid+1)/2))
               le=(int)mid+1;
               else
                   ri=(int)mid-1;
        
           }
           return (int)le-1;
        
         //  O(n)
           
          int count=0;
           int i=1;
           while(true)
           {
               n-=i;
               i++;
               count++;
               if(n<i)
                   break;
            
           }
        
           return count;
    }
}