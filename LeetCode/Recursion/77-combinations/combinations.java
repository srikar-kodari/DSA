class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;

        combinations(0, arr, k, new ArrayList<>(), result);

        return result;
    }

    static void combinations(int index, int[] arr, int k, List<Integer> list, List<List<Integer>> result) {

        if(list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            list.add(arr[i]);
            combinations(i+1, arr, k, list, result);
            list.removeLast();
        }
    }
}