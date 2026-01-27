class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;

        // Skip leading whitespace
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check for sign
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Build result from digits
        while(i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            
            // Handle overflow
            if(result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            i++;
        }

        return (int)(result * sign);
    }
}