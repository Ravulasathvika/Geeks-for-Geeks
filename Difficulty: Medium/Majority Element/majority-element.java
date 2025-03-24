//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int n=arr.length;
        int num1=-1,count1=0;
        for(int num:arr)
        {
            if(num==num1)
            {
                count1++;
            }
            else if(count1==0)
            {
                num1=num;
                count1=1;
            }
            else
            {
                count1--;
            }
        }
        count1=0;
        for(int num:arr)
        {
            if(num==num1)
            {
                count1++;
            }
        }
        if(count1>n/2)
        {
            return num1;
        }
        else
        {
            return -1;
        }
    }
}