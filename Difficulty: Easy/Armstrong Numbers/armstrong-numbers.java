// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int count=0;
        int sum=0;
        int temp=n;
        int res=n;
        while(n!=0)
        {
            int rem=n%10;
            n=n/10;
            count++;
        }
        while(temp!=0)
        {
            int rem=temp%10;
            sum+=Math.pow(rem,count);
            temp=temp/10;
        }
        if(sum==res)
        {
            return true;
        }
        return false;
    }
}