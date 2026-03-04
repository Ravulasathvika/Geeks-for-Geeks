class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==2)
            {
                res.add(num);
                
            }
        }
        return res;
        
    }
}