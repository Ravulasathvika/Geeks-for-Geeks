// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            while(freq[i]>0)
            {
                sb.append((char)(i+'a'));
                freq[i]--;
                
            }
        }
        return sb.toString();
    }
}