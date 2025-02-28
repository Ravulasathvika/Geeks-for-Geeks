
class Solution:
    def nthFibonacci(self, n: int) -> int:
        # code here
        if n==0:
            return 0
        if n==1:
            return 1
        else:
            a=0
            b=1
            while(n-1):
                c=0
                c=a+b
                n-=1
                a=b
                b=c
            return c



#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        n = int(input())

        obj = Solution()
        res = obj.nthFibonacci(n)

        print(res)

        print("~")

# } Driver Code Ends