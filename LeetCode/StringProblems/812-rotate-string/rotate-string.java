class Solution {
    public boolean rotateString(String s, String goal) {

        int k = s.length(); // Max number of rotations

        if(k == 1) {
            if(s.equals(goal)) return true;
            else return false;
        }

        StringBuilder sb = new StringBuilder(s);

        while(k-- > 0) {

            char first = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(first);

            if(sb.toString().equals(goal)) return true;
        }
        return false;
    }
}