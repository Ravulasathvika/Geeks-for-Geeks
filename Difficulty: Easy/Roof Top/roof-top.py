#User function Template for python3

class Solution:
    
    #Function to find maximum number of consecutive steps 
    #to gain an increase in altitude with each step.
    def maxStep(self, arr):
        #Your code here
        if not arr or len(arr)==1:
            return 0
        current_sum=0
        max_sum=0
        for i in range(1,len(arr)):
            if arr[i]>arr[i-1]:
                current_sum+=1
                max_sum=max(max_sum,current_sum)
            else:
                current_sum=0
        return max_sum
            
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math


def main():
    T = int(input())
    while (T > 0):

        arr = [int(x) for x in input().strip().split()]
        ob = Solution()
        print(ob.maxStep(arr))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends