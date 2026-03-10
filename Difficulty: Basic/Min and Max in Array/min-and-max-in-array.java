class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min_ele=Integer.MAX_VALUE;
        int max_ele=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num<min_ele)
            {
                min_ele=num;
            }
            if(num>max_ele)
            {
                max_ele=num;
            }
        }
        return new ArrayList<>(Arrays.asList(min_ele,max_ele));
    }
}
