// LeetCode 169. Majority Element solution in Java.

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int len=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int val=-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        
        {
            if(entry.getValue()>len/2)
            {
                return entry.getKey();
            }
            
        }
        return val;
    }
}

 