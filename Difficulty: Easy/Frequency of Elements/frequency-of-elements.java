class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        ArrayList<Integer> keys=new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(int key:keys)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            res.add(temp);
            
        }
        return res;
    }
}