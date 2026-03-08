// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
                sb.append(ch);
                
            }
        }
        return sb.toString();
    }
}
