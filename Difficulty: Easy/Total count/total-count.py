#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

class Solution:
    def totalCount(self, k, arr):
        count=0
        
        
        for i in range(len(arr)):
            count+=int(arr[i]/k)
            if arr[i]%k!=0:
                count+=1
             
            
        return count
            
            
                
                
                
            
            
        
        # code here

#{ 
 # Driver Code Starts.
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while t > 0:
        k= int(input())
        arr = list(map(int, input().split()))
        ob = Solution()
        res = ob.totalCount(k,arr)
        print(res)
        t -= 1


# } Driver Code Ends