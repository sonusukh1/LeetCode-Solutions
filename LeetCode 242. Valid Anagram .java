// LeetCode 242. Valid Anagram in java.

class Solution {
    public boolean isAnagram(String s, String t) {
   
        int [] str1=new int[26];
        int [] str2=new int[26];
        for(int i=0;i<s.length();i++)
        {
            str1[s.charAt(i)-'a']++;
            }
        for(int i=0;i<t.length();i++)
        {
            str2[t.charAt(i)-'a']++;
            }
        for(int i=0;i<26;i++)
        {
            if(str1[i]!=str2[i])
                return false;
        }
        return true;
 // Solution 2 in O(nlogn) T.C.
        // char [] arr=s.toCharArray();
        // char [] arr2=t.toCharArray();
        // Arrays.sort(arr);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr,arr2);
    }
}