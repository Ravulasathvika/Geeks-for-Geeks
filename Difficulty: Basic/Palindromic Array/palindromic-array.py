# Your task is to complete this function
# Function should return true/false
def isPalinArray(arr):
    # Code here
    for i in arr:
        if not palindrome(i):
            return False
    return True
def palindrome(n):
    orginal=n
    sum1=0
    while n>0:
        rem=n%10
        sum1=sum1*10+rem
        n=n//10
    return orginal==sum1