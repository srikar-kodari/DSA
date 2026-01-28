class Solution {
    public String reversePrefix(String word, char ch) {

        if(!word.contains(String.valueOf(ch))) return word;

        int index = word.indexOf(ch);

        String s = word.substring(0, index+1);
        String first = new StringBuilder(s).reverse().toString();

        String last = word.substring(index+1);

        return first + last;        
    }
}