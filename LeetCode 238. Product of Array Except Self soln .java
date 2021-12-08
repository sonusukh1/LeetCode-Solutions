// LeetCode 238. Product of Array Except Self soln in java

import java.util.*;
import java.math.BigInteger;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=p;
            p = p * nums[i];
            }
        p=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]*=p;
            p=p*nums[i];
        }
        return arr;
    }
}