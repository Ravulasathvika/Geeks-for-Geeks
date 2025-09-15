class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        largest=-1
        smallest=-1
        for i in arr:
            if(i>largest):
                
                smallest=largest
                largest=i
                
            elif(i<largest and i>smallest):
                smallest=i
        return smallest