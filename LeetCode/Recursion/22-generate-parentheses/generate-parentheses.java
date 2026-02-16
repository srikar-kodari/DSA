class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        genParentheses("", 0, 0, n, result);

        return result;        
    }

    public void genParentheses(String curr, int open, int close, int n, List<String> result) {

        // Base case: length reached
        if (curr.length() == 2*n) {
            result.add(curr);
            return;
        }

        if(open < n) genParentheses(curr + "(", open + 1, close, n, result);
        if(close < open) genParentheses(curr + ")", open, close + 1, n, result);
    }

}
