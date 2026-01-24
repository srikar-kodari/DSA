class Solution {
    public String removeOuterParentheses(String s) {

        if(s.isEmpty()) return "";

        char[] arr = s.toCharArray();

        String result = "";

        int depth = 0;

        for(char c : arr) {
            if((c == '(' && depth >= 1) || (c == ')' && depth >= 2)) result += c;

            if(c == '(') depth++;
            else depth--;
        }
        return result;
    }
}