class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        if(s.length == 0 || g.length == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int gLen = g.length, sLen = s.length;
        int gP = 0, sP = 0, count = 0;

        while (gP < gLen && sP < sLen) {

            if(s[sP] >= g[gP]) {
                count++;
                sP++;
                gP++;
            }
            else sP++;
        }

        return count;
    }
}