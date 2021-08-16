// LeetCode Self Dividing Numbers 728 java Solutionm beats 99% of solutions

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();  //initializing list for adding self dividing number

        for(int i=left;i<=right;i++)   //for loop for every integer including left and right
        {
      
      if(isSelf(i))          // isSelf function call to check if it is SDN

            {

                list.add(i);   // if condition is true then adding it to list

            }

        }

        return list;    // returning list
        
    }
    public boolean isSelf(int num)
    {
        int rem=0;
         
        int temp=num;
        
        while(num>0)    // While num integer contains any digit
        {
            rem=num%10;   // taking last digit of num
           
            if(rem==0)    // if last digit is 0 we return false because it is mentioned in the question SDN does't contain any zero

                return false;
           
            if(temp%rem!=0)    // if number is not divisibe by any of it's digit we simply return false
                return false;
            num/=10;
        }
        return true;       // if all condition fails we return true
    }
}