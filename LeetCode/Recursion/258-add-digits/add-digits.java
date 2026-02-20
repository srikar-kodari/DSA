class Solution {
    public int addDigits(int num) {

        int dup = num;
        while(true) {

            int sum = 0;
            while(dup > 0) {
                int digit = dup % 10;
                sum += digit;

                dup = dup / 10;
            }

            if(sum / 10 == 0) return sum;

            dup = sum;
        }
    }
}