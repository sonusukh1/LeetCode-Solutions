// LeetCode 917. Reverse Only Letters

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
       
        int start=0,end=arr.length-1;
        while(start<=end){
        if(!isAlphaLetter(arr[start]))
            start++;
        else if(!isAlphaLetter(arr[end]))
            end--;
        else{
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
        return String.valueOf(arr);
    }
           public boolean isAlphaLetter(char a){
               return (a>='a'&&a<='z')||(a>='A'&&a<='Z');
           }
}

// Solution 2nd less optimized
    
// class Solution {
//     public String reverseOnlyLetters(String s) {
        
//     char [] arr=s.toCharArray();
//         int start=0;
//         int end=arr.length-1;
//         while(start<end)
//         {
//             if((arr[start]>=33 && arr[start]<=64 ) || (arr[start]>=91 && arr[start]<=96))
//                 start++;
//             else if((arr[end]>=33 && arr[end]<=64 ) ||(arr[end]>=91 && arr[end]<=96))
//                 end--;
//             else 
//             {
//                 char temp=arr[start];
//                 arr[start]=arr[end];
//                 arr[end]=temp;
//                 start++;
//                 end--;
//             }
//         }
//     String temp="";
//         for(int i=0;i<arr.length;i++)
//             temp+=arr[i];
//         return temp;
//     }
    
// }