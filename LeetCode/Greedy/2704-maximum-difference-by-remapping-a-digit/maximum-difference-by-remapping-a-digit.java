class Solution {
    public int minMaxDifference(int num) {
        
        String s = Integer.toString(num);

        char c = ' ';
        for(char ch : s.toCharArray()) {
            if(ch != '9') {
                c = ch;
                break;
            }
        }

        String max = (c == ' ') ? s : s.replace(c, '9');
        String min = s.replace(s.charAt(0), '0');

        return Integer.valueOf(max) - Integer.valueOf(min);
    }
}
