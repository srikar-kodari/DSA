class Solution {
    public boolean isStrictlyPalindromic(int n) {

        for(int i=2; i<=n-2; i++) {

            String s = Integer.toString(n, i);

            if(!s.equals(new StringBuilder(s).reverse().toString())) return false;
        }
        return true;        
    }
}