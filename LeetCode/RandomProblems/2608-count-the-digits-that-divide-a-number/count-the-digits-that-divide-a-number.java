class Solution {
    public int countDigits(int num) {

        int dummy = num;
        int result = 0;
        while(dummy > 0) {
            int digit = dummy % 10;
            dummy = dummy / 10;

            if(num % digit == 0) result++;
        }
        
        return result;        
    }
}