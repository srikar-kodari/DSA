class Solution {

    static final long MOD = 1_000_000_007L;

    public int countGoodNumbers(long n) {

        long evenCount = (n + 1) / 2;  // positions 0,2,4...
        long oddCount = n / 2;        // positions 1,3,5...

        long part1 = power(5, evenCount);
        long part2 = power(4, oddCount);

        return (int) ((part1 * part2) % MOD);
    }

    private static long power(long base, long exponent) {

        long result = 1;
        base = base % MOD;

        while (exponent > 0) {

            if (exponent % 2 == 1) {   // if exponent is odd
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;   // square base
            exponent = exponent / 2;      // reduce exponent
        }

        return result;
    }

}