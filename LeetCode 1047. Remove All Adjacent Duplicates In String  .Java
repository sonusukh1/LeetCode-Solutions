// LeetCode 1047. Remove All Adjacent Duplicates In String Sol. in Java

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack= new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(stack.size()==0 || s.charAt(i)!=stack.peek())
            {
                stack.push(s.charAt(i));
            }
            else stack.pop();
        }
        StringBuilder sb=new StringBuilder();
        while(stack.size()!=0)
        {
            sb.append(stack.pop());
        }
        sb=sb.reverse();
        String res= sb.toString();
        return res;
    }
}