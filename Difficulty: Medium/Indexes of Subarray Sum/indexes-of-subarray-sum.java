
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int curr_sum=0;
        int start=0;
        for(int end=0;end<arr.length;end++)
        {
           curr_sum+=arr[end];
           while(curr_sum>target && start<=end)
           {
               curr_sum-=arr[start];
               start++;
           }
           if(target==curr_sum)
           {
               res.add(start+1);
               res.add(end+1);
               return res;
           }
        }
        res.add(-1);
        return res;
    }
}
