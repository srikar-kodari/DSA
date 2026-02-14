class Solution {
    public int numberOfMatches(int n) {

        int result = 0;
        int dup = n;

        while(dup != 1) {

            if(dup % 2 == 0) {
                result += dup / 2;
                dup = dup / 2;
            }

            else {
                result += (dup-1)/2;
                dup = (dup-1)/2 + 1;
            }
        }

        return result;
    }
}