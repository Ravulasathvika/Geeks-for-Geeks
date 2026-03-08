// User function Template for Java
class Solution {
    String encryptString(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<=s.length();i++)
        {
            if(i<s.length() && s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                sb.append(s.charAt(i-1)).append(count);
                count=1;
            }
            
        }
        return sb.reverse().toString();
    }
}