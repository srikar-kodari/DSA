class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        int len = arr.length;

        int min = Integer.MAX_VALUE;

        for(int i=1; i<len; i++) {  // Finding min difference

            min = Math.min(min, arr[i]-arr[i-1]);
        }

        for(int i=0; i<len-1; i++) {
            
            if(arr[i+1] - arr[i] == min) result.add(Arrays.asList(arr[i], arr[i+1]));
        }

        return result;
    }
}