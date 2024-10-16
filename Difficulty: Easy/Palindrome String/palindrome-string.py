#User function Template for python3
class Solution:
	def isPalindrome(self, S):
	    s1=S[::-1]
	    if s1==S:
	        return 1
	    else:
	        return 0
		# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.isPalindrome(S)
		print(answer)

# } Driver Code Ends