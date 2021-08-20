// LeetCode 1189. Maximum Number of Balloons solution in java.

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int [] arr=new int[26];  //frequency Array for alphabet present in text.

        for(int i =0;i<text.length();i++)
        {
            arr[text.charAt(i)-'a']++;   // filling up array with alphabet frequency.
        }
        
        int minimum=arr[1]; 

        minimum=Math.min(minimum,arr[0]); 

        minimum=Math.min(arr[11]/2,minimum);
  
        minimum=Math.min(arr[14]/2,minimum);
  
        minimum=Math.min(arr[13],minimum);
        
        return minimum;
    }
}
