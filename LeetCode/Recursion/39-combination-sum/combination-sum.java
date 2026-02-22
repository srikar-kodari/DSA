class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        combinationSum1(0, candidates, target, result, new ArrayList<>());

        return result;
    }

    static void combinationSum1(int index, int[] arr, int targetSum, List<List<Integer>> ans, List<Integer> list) {

        if(index == arr.length) {

            if(targetSum == 0) {

                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[index] <= targetSum) {

            list.add(arr[index]);
            combinationSum1(index, arr, targetSum-arr[index], ans, list);
            list.removeLast();
        }

        combinationSum1(index+1, arr, targetSum, ans, list);
    }

}
