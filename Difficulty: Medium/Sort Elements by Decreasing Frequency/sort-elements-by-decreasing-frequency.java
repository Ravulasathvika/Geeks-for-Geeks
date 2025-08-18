// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:arr) res.add(num);
        Collections.sort(res,(a,b)->
        {
            if(!freq.get(a).equals(freq.get(b)))
            {
                return freq.get(b)-freq.get(a);
            }
            else
            {
                return a-b;
            }
        });
        return res;
        
    }
}