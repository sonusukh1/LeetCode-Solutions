// LeetCode 704. Binary Search solution in java

class Solution {
    public int search(int[] nums, int target) {
        
       return binarySearch(nums,0,nums.length-1,target);
        
        
    }
    public int binarySearch(int [] arr,int start,int end,int target)
    {
        int mid=(start+end)/2;
    while(start<=end)
    {
        
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]<target)
        {
          start=mid+1;
            }
        else
        {
            end=mid-1;
        }
        mid=(start+end)/2;
    }
        return -1;
        
    }
}