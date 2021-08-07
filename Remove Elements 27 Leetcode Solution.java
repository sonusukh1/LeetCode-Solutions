// Remove Element 27 LeetCode Solution Java beats 100% of solution

class Solution {
    public int removeElement(int[] nums, int val) {
    if(nums.length==0)
        return 0;
        
               int j=0;
           for(int i=0;i<nums.length;i++)
           {
               if(nums[i]!=val)
                   nums[j++]=nums[i];   //putting valid elements in the starting of array
                 
           }
        return j;
        }
}