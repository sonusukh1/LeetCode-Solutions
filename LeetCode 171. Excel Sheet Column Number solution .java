// LeetCode 171. Excel Sheet Column Number solution in java.

  class Solution {
  
  public int titleToNumber(String s) {

        int res=0;

        int p=0;

        for(int i=s.length()-1;i>=0;i--)

        {

            int val=s.charAt(i)-'A'+1;

            res+=val*Math.pow(26,p);

            p++;

      }

        return res;

    }

}