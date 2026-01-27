class Solution {
    public int beautySum(String s) {

        int sum = 0;

        int len = s.length();
        for(int i=0; i<len; i++) {
            for(int j=i+3; j<=len; j++) {  // j-i >= 3 for minimum substring length

                String t = s.substring(i, j);

                sum += singleBeautySum(t);
            }
        }

        return sum;
    }

    public int singleBeautySum(String s) {

        int[] arr = new int[26]; // s only contains lowercase letters

        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int freq : arr) {
            if(freq > 0) {
                min = Math.min(min, freq);
                max = Math.max(max, freq);
            }
        }
        sum += max - min;

        return sum;
    }

}