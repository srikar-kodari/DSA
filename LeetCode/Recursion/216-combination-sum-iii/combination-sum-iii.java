class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();

        int[] arr = {1,2,3,4,5,6,7,8,9};

        sumCombination3(0, arr, k, n, new ArrayList<>(), result);

        return result;
    }

    static void sumCombination3(int index, int[] arr, int k, int targetSum, List<Integer> list, List<List<Integer>> result) {

        if(list.size() == k && targetSum == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            if(arr[i] > targetSum) break;

            list.add(arr[i]);
            sumCombination3(i+1, arr, k, targetSum - arr[i], list, result);
            list.removeLast();
        }
    }
}
