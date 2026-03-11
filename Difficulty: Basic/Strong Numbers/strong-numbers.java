// User function Template for Java

class Solution {
    static int isStrong(int n) {
        // code here
        int rem=0;
        int sum=0;
        int orginal=n;
        while(n!=0)
        {
            rem=n%10;
            sum+=factorial(rem);
            n=n/10;
        }
        if(sum == orginal)
            return 1;
        else
            return 0;
    }
    static int factorial(int rem)
    {
        int fact=1;
        for(int i=2;i<=rem;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}