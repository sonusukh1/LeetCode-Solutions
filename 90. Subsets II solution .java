// LeetCode 90. Subsets II

class Solution {
    HashSet<List> list=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        List<Integer> curr=new ArrayList<Integer> ();
        List<List<Integer>> ans=new ArrayList<>();
        rec(nums,0,curr,ans);
       
        return ans;
    }
    public void rec(int[] arr,int i,List<Integer> curr,List<List<Integer>> ans)
    {
        if(i==arr.length)
        {    
            if(!list.contains(curr))
            ans.add(new ArrayList<Integer> (curr));
            list.add(curr);
            return;
        }
        curr.add(arr[i]);
      //  if(list.contains(ans))
        rec(arr,i+1,curr,ans);
        curr.remove(curr.size()-1);
        rec(arr,i+1,curr,ans);
    }
}