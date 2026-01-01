class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        for(int i=0; i<names.length; i++) {
            map.put(heights[i], names[i]);
        }

        String[] result = map.values().toArray(new String[0]);

        return result;
    }
}