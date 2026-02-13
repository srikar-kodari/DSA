class Solution {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;
        int dummy = n;

        while(dummy > 0) {

            int digit = dummy % 10;
            dummy = dummy / 10;

            sum += digit;
            product *= digit;
        }

        return product - sum;        
    }
}