class Solution {
    public String longestCommonPrefix(String[] str) {

        if(str.length == 1) return str[0];

        Arrays.sort(str);

        String s1 = str[0];
        String s2 = str[str.length-1];

        int min = Math.min(s1.length(), s2.length());

        for(int i=0; i<min; i++) {

            if(s1.charAt(i) != s2.charAt(i)) return s1.substring(0, i);
        }

        return s1;
    }
}