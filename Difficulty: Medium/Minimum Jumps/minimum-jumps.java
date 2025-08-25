class Solution {
    static int minJumps(int[] arr) {
        // code here
        if(arr.length<=1) return 0;
        if(arr[0]==0) return -1;
        int jump=0,end=0,farthest=0;
        for(int i=0;i<arr.length-1;i++)
        {
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end)
            {
                jump++;
                end=farthest;
                if(end>=arr.length-1)
                {
                    return jump;
                }
            }
            
        }
        return -1;
    }
}