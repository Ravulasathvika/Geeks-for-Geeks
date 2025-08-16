class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set=new HashSet<>();
        int max_num=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max_num=Math.max(max_num,right-left+1);
        }
        return max_num;
        
    }
}