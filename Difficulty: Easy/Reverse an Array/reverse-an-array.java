class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        for(int i=0;i<=mid;i++)
        {
            if(left!=right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            left++;
            right--;
        }
    }
}