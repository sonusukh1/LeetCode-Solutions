// LeetCode 1492. The kth Factor of n.solution in java beats 100% of solutions.

class Solution {
    public int kthFactor(int n, int k) {
         int num=0; // initializing variable to get Kth factor when num becomes equal to k
 
         
        int i;
        
      for(i=1;i<=n;i++) // for loop til value of n.
        {
            if(n%i==0) // checking if i is factor of n.
            
            {
                num++;    // increament num by 1;
                if(num==k) // if num and k becomes equal breaking the loop.
                    break;
                
            }
        }
        if(num!=k)   // checking if if n has less than k factors returning -1.
            return -1;
        else 
return i;     // else returning 1.
    }
}
