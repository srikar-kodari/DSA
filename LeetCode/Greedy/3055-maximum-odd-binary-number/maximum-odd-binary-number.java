class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int n = s.length();
        int count1 = (int) s.chars().filter(c -> c == '1').count();

        StringBuilder sb = new StringBuilder();

        sb.append("1".repeat(count1-1))
            .append("0".repeat(n-count1))
            .append("1");

        return sb.toString();
    }
}