class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        
        int size = s.size();
        int midIndex = size / 2;

        Stack<Integer> temp = new Stack<>();

        
        for (int i = 0; i < midIndex; i++) {
            temp.push(s.pop());
        }

        
        s.pop();

        
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
        
    }
}