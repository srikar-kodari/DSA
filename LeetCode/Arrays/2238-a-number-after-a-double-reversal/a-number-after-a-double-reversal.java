class Solution {
    public boolean isSameAfterReversals(int num) {

        int n = reverse(num);
        int k = reverse(n);

        if(k == num) return true;
        else return false;
    }

    public int reverse(int num) {
        int rev = 0;

        while(num > 0) {

            int ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }
        return rev;
    }
}