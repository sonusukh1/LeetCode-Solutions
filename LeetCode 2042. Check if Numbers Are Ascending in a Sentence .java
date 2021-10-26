// LeetCode 2042. Check if Numbers Are Ascending in a Sentence


class Solution {
    public boolean areNumbersAscending(String s) {
        String [] str=s.split(" ");
        int prev=-1;
        for(int i=0;i<str.length;i++)
        {
            if(isDigit(str[i]))
            {
                int digit=Integer.parseInt(str[i]);
                if(digit>prev)
                    prev=digit;
                else
                    return false;
            }
        }
        return true;
        
    }
    public boolean isDigit(String str)
    {
        if(Character.isDigit(str.charAt(0)))
            return true;
        else
            return false;
        
    }
    
}