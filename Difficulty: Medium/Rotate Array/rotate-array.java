class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
        reverse(0,n-1,arr);
        
    }
    static void reverse(int left,int right,int arr[])
    {
        while(left<right)
        {
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
    }
}