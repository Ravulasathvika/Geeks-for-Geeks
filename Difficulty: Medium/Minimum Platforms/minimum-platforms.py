#User function Template for python3

class Solution:    
    #Function to find the minimum number of platforms required at the
    #railway station such that no train waits.
    def minimumPlatform(self,arr,dep):
        # code here
        arr.sort()
        dep.sort()
        plat_form=1
        result=1
        i=1
        j=0
        while(i<n and j<n):
            if(arr[i]<=dep[j]):
                plat_form+=1
                i+=1
            elif(arr[i]>dep[j]):
                plat_form-=1
                j+=1
            if(plat_form>result):
                result=plat_form
        return result
        
            
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys

#Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        n = int(input())
        arrival = list(map(int, input().strip().split()))
        departure = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.minimumPlatform(arrival, departure))
        print("~")

# } Driver Code Ends