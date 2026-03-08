/*Complete the function below*/
class Solution {
    public static int convertFive(int n) {
        // add code here.
        int result = 0;
        int place = 1;

        while(n > 0) {
            int digit = n % 10;
            
            if(digit == 0) {
                digit = 5;
            }
            
            result += digit * place;
            place *= 10;
            n /= 10;
        }

        return result;
    }
}