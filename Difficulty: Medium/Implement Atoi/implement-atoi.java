//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i=0;
        int sign=1;
        int res=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        {
            sign=(s.charAt(i)=='-') ? -1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int digit=s.charAt(i)-'0';
            if(res>(Integer.MAX_VALUE-digit)/10)
            {
                return (sign==-1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res=res*10+digit;
            i++;
        }
        return res*sign;
        
    }
}