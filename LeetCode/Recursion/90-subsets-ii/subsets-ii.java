class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        subsetSum2(0, arr, new ArrayList<>(), result);

        return result;        
    }

    void subsetSum2(int index, int[] arr, List<Integer> list, List<List<Integer>> result) {

        result.add(new ArrayList<>(list));

        for(int i = index; i < arr.length; i++) {

            if(i != index && arr[i] == arr[i-1]) continue;   // If it's a repeated element, then continue

            list.add(arr[i]);
            subsetSum2(i+1, arr, list, result);
            list.removeLast();
        }
    }
}
