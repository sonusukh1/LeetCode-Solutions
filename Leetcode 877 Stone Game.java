//LeetCode Problem 877 -> Stone Game

// Java Solution

class Solution {
    public boolean stoneGame(int[] piles) {
        int alex=0;
        int lee=0;
        for(int i=0;i<piles.length;i++)
        {
            if(i%2==0)
            {
                //Taking Maximum value alex can select
    int max=Math.max(piles[i],piles[piles.length-i-1]);
            alex+=max;
                }
    
            else
            
            {
                //Taking Maximum value lee can select
        int max=Math.max(piles[i],piles[piles.length-i-1]);
            lee+=max;
            }
            
        }
        //Still if alex have more points then alex will always win.Otherwise lee will win
        if(alex<lee)
            return false;

        return true;
    }
}