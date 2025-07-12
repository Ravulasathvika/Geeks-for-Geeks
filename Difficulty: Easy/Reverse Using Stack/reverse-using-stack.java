class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> res=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:S.toCharArray())
        {
            res.push(c);
        }
        while(!res.isEmpty())
        {
            sb.append(res.pop());
        }
        return sb.toString();
        
    }
}