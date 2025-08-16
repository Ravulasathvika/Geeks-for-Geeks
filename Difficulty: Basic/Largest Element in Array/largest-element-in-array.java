class Solution {
    public static int largest(int[] arr) {
        // code here
        int max_num=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max_num=Math.max(max_num,arr[i]);
        }
        return max_num;
        
    }
}
