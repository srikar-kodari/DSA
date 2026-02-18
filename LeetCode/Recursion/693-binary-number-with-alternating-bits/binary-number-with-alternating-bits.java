class Solution {
    public boolean hasAlternatingBits(int n) {

        String s = Integer.toBinaryString(n);
        int len = s.length();

        if(len == 1) return true;

        for(int i=1; i<len; i++) {

            if(s.charAt(i) == s.charAt(i-1)) return false;
        }
        return true;        
    }
}