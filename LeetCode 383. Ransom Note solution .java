// LeetCode 383. Ransom Note solution in java.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int [] ranson=new int[26]; // frequency arrays for both the string.
       int [] mag=new int[26];
        for(int i=0;i<ransomNote.length();i++)
        {
            ranson[ransomNote.charAt(i)-'a']++;  // filling ranson array with String ransomNote.
        }
        for(int i=0;i<magazine.length();i++)
        {
            mag[magazine.charAt(i)-'a']++; // filling mag array with String magazine.
        }
        for(int i=0;i<26;i++)
        {
            if(ranson[i]>0)
            {
                if(mag[i]>=ranson[i])   
                    continue;
                else
                    return false;
            }
        }
        return true;
        
    }
}