// LeetCode 387. First Unique Character in a String solution in java

class Solution {
    public int firstUniqChar(String s) {
    
    int [] char_frequency=new int [26]; // frequency array for character.       
         
 for(int i=0;i<s.length();i++)
       
 {
         
   char_frequency[s.charAt(i)-'a']++; //   filling up array with frequency. 

        }

        for(int i=0;i<s.length();i++)

        {

            if(char_frequency[s.charAt(i)-'a']==1) // checking for first occurrence

                return i;

        }

        return -1;

    }

}