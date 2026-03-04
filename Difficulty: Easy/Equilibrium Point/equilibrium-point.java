class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum = 0;
        int leftSum = 0;
        
        // Step 1: Find total sum
        for (int num : arr) {
            totalSum += num;
        }
        
        // Step 2: Traverse array
        for (int i = 0; i < arr.length; i++) {
            
            totalSum -= arr[i];  // Now totalSum becomes right sum
            
            if (leftSum == totalSum) {
                return i;  // Equilibrium index found
            }
            
            leftSum += arr[i];
        }
        
        return -1;
    }
    
}
