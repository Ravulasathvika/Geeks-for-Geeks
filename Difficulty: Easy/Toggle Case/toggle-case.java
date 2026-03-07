class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch>='a' && ch<='z')
            {
                sb.append((char)(ch-32));
                
            }
            else
            {
                sb.append((char)(ch+32));
            }
        }
        return sb.toString();
    }
}
