// LeetCode 1935. Maximum Number of Words You Can Type Solution in Java

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        char [] arr=brokenLetters.toCharArray(); // converting String(brokenLetters) to char array
       
        String [] str=text.split(" ");    // converting String "text" to String Array
       
        int count=0;
       
        Boolean res=false;
                                      // Two for loops
       for(int i=0;i<str.length;i++)
        {  
            for(int j=0;j<arr.length;j++)
            
            {
            
                res=false;
           
               // char temp=arr[j];
                
                if(str[i].indexOf(arr[j])>-1)  // Checking if brokenletters.charAt(any index) is present we break the loop.
                {
                
                    res=true;
                    
                    break;
                }
            }
        if(res==false)    // if it is not present we increase count variable by vale 1;
            count++;
         
        }
        return count;   // Returning Count
    }
}