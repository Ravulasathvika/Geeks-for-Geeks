
class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> res=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='[' || c=='{' || c=='(')
            {
                res.push(c);
                
            }
            else
            {
                if(res.isEmpty()) return false;
                char top=res.pop();
                if((top!='(' && c==')') || (top!='[' && c==']') || (top!='{' && c=='}'))
                {
                    return false;
                }
                
            }
        }
        if(res.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
