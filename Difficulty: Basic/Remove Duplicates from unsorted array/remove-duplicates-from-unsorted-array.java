// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        for(int num:arr)
        {
            if(!map.contains(num))
            {
                map.add(num);
                res.add(num);
                
            }
        }
        return res;
        
    }
}