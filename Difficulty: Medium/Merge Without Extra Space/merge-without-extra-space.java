//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            String arr1[] = br.readLine().trim().split(" ");
            String arr2[] = br.readLine().trim().split(" ");

            int a[] = new int[arr1.length];
            int b[] = new int[arr2.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);
            for (int i = 0; i < b.length; i++) b[i] = Integer.parseInt(arr2[i]);

            Solution ob = new Solution();
            ob.mergeArrays(a, b);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                str.append(a[i] + " ");
            }
            System.out.println(str);
            str = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                str.append(b[i] + " ");
            }
            System.out.println(str);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int m=a.length;
        int n=b.length;
        int gap=nextgap(m+n);
        while(gap>0)
        {
            int i=0;
            int j=gap;
            while(j<m+n)
            {
                if(i<m && j<m)
                {
                    if(a[i]>a[j])
                    {
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
                else if(i<m && j>=m)
                {
                    if(a[i]>b[j-m])
                    {
                        int temp=a[i];
                        a[i]=b[j-m];
                        b[j-m]=temp;
                    }
                }
                else
                {
                    if(b[i-m]>b[j-m])
                    {
                        int temp=b[i-m];
                        b[i-m]=b[j-m];
                        b[j-m]=temp;
                    }
                }
                i++;
                j++;
            }
            gap=nextgap(gap);
            
        }
        
        
    }
    private int nextgap(int gap)
    {
        if(gap<=1)
        {
            return 0;
        }
        return (gap/2)+(gap%2);
        
        
    }
}
