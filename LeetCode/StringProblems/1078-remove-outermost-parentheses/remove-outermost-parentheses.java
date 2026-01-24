class Solution {
    public String removeOuterParentheses(String s) {

        char[] arr = s.toCharArray();

        StringBuilder result = new StringBuilder();

        int depth = 0;

        for(char c : arr) {
            if((c == '(' && depth >= 1) || (c == ')' && depth >= 2)) result.append(c);

            if(c == '(') depth++;
            else depth--;
        }
        return result.toString();
        
    }
}