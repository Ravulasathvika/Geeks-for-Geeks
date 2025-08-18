// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            if(num>=A && num<=B)
            {
                set.add(num);
            }
        }
        return set.size()==(B-A+1);
    }
}
