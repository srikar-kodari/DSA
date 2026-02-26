class Solution {
    public int numSteps(String s) {
        
        if (s.length() == 1) return 0;

        int steps = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';

            int effective = bit + carry;
            if (effective == 1) {
                steps += 2;
                carry = 1;
            } else {
                steps += 1;
            }
        }

        return steps + carry;
    }
}
