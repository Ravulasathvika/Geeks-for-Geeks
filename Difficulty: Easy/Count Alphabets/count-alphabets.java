// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        int count=0;
        for(Character ch:S.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                count++;
            }
        }
        return count;
        
    }
}