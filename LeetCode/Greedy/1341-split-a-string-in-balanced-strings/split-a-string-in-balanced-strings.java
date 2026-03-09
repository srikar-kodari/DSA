class Solution {
    public int balancedStringSplit(String s) {

        int ans = 0;
        int count = 0;

        for(char c : s.toCharArray()) {
            if(c == 'L') count++;
            else count--;

            if(count == 0) ans++;
        }

        return ans;
    }
}