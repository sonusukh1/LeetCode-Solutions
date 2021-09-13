//LeetCode 209. Minimum Size Subarray Sum soln. in java

class Solution {

1->  // O(N^2)


    public int minSubArrayLen(int target, int[] nums) {
//        int min=Integer.MAX_VALUE;
//         int sum=0;
        
        
//         for(int i=0;i<nums.length;i++)
//         {
//             sum=0;
//             for(int j=i;j<nums.length;j++)
//             {
//                 sum+=nums[j];
//                 if(sum>=target)
//                 {
//                     min=Math.min(min,j-i+1);
//                 }
                
//             }
//         }

//         if(min!=Integer.MAX_VALUE)
//         return min;
//         return 0;


2->  O(N)

        int min=Integer.MAX_VALUE;
        
        int sum=0;
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                
                min=Math.min(min,i-left+1);
                sum-=nums[left];
                left++;
                    
                }
            
        }
        if(min!=Integer.MAX_VALUE)
         return min;
         return 0;
    }
}