class Solution {
    public String longestCommonPrefix(String[] str) {

        Arrays.sort(str);

        StringBuilder result = new StringBuilder();

        String s1 = str[0];
        String s2 = str[str.length-1];

        int min = Math.min(s1.length(), s2.length());

        for(int i=0; i<min; i++) {

            if(s1.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));
            }
            else return result.toString();
        }

        return result.toString();
    }
}