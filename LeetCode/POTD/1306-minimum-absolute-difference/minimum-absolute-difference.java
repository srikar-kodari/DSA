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
            for(int j=i+1; j<len; j++) {

                if(arr[j] - arr[i] == min) result.add(Arrays.asList(arr[i],arr[j]));

                if(arr[j] - arr[i] > min) break;
            }
        }

        return result;
    }
}