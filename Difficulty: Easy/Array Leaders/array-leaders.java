class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int lead_ele=0;
        for(int i=0;i<arr.length;i++)
        {
            lead_ele=arr[i];
            int j=i;
            for(j=i+1;j<arr.length;j++)
            {
                if(lead_ele<arr[j])
                {
                    break;
                }
            }
            if(j==arr.length)
            {
                result.add(lead_ele);
            }
        }
        return result;
    }
}
