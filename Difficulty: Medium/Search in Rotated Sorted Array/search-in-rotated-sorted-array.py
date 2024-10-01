#User function Template for python3

class Solution:
    def search(self,arr,target):
        # Complete this function
        left,right=0,len(arr)-1
        while left<=right:
            mid=(left+right)//2
            if arr[mid]==target:
                return mid
            if arr[left]<=arr[mid]:
                if arr[left]<=target<arr[mid]:
                    right=mid-1
                else:
                    left=mid+1
            else:
                if arr[mid]<target<=arr[right]:
                    left=mid+1
                else:
                    right=right-1
        return -1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        A = list(map(int, input().strip().split()))
        k = int(input())
        ob = Solution()
        print(ob.search(A, k))

# } Driver Code Ends