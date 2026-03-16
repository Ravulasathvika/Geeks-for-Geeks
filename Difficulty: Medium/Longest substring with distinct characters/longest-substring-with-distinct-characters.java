class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int max_ele=0;
        HashSet<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            
            max_ele=Math.max(max_ele,right-left+1);
        }
        return max_ele;
        
        
    }
}