// 213. LeetCode House Robber II solution in Java

class Solution {

    public int rob(int[] nums) {
  int dp[]=new int[nums.length];
        if(nums.length==1)
            return nums[0];
        int max=0;
        int max2=0;
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=1;i<nums.length-1;i++)
        {
            dp[i+1]=Math.max(dp[i],nums[i]+dp[i-1]);
        }
        max=dp[nums.length-1];
        int dp2[]=new int[nums.length];
        dp2[0]=0;
        dp2[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            dp2[i]=Math.max(dp2[i-1],nums[i]+dp2[i-2]);
        }
        max2=dp2[nums.length-1];
        return Math.max(max,max2);
    
    }

}