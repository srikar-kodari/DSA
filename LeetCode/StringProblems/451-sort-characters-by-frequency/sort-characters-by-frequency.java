class Solution {
    public String frequencySort(String s) {

        int[] freqArray = new int[62];

        for(char c : s.toCharArray()) {     // Frequency Count

            if(Character.isLowerCase(c)) freqArray[c - 'a']++;
            else if(Character.isUpperCase(c)) freqArray[c - 'A' + 26]++;
            else freqArray[c - '0' + 52]++;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<62; i++) {
            if(freqArray[i] == 0) continue;

            if(i >= 0 && i <= 25) map.put((char) ('a' + i), freqArray[i]);

            else if(i >= 26 && i <= 51) map.put((char) ('A' + i - 26), freqArray[i]);

            else map.put((char) ('0' + i - 52), freqArray[i]);
        }

        StringBuilder result = new StringBuilder();

        map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                               .forEach(e -> result.append(String.valueOf(e.getKey()).repeat(e.getValue())));
                               
                
        return result.toString();
    }
}