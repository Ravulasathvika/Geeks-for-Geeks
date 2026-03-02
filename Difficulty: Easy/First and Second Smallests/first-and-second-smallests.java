class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int first_min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<first_min)
            {
                second_min=first_min;
                first_min=arr[i];
            }
            if(arr[i]>first_min && arr[i]<second_min)
            {
                second_min=arr[i];
            }
        }
        if(second_min == Integer.MAX_VALUE) {
            res.add(-1);   
        } else {
            res.add(first_min);
            res.add(second_min);
        }
        return res;
        
        
    }
}
