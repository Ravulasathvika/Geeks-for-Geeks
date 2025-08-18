class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        int i=0;
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==2)
            {
                res[i++]=num;
            }
            if(i==2) break;
        }
        
        return res;
    }
}