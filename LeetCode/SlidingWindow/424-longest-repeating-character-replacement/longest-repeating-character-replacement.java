class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int left = 0, right = 0, maxFreq = 0, maxLen = 0;
        int[] hash = new int[26];

        while (right < n) {

            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {

                hash[s.charAt(left) - 'A']--;

                // Update Max Frequency
                maxFreq = 0;
                for(int i=0; i<26; i++) maxFreq = Math.max(maxFreq, hash[i]);
                
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}