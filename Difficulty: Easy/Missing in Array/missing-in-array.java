class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=1;
        for(int num:arr)
        {
            if(count!=num)
            {
                return count;
            }
            count++;
        }
        return count;
    }
}