class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        combinationSum(0, candidates, target, result, new ArrayList<>()); // Must Pass Sorted Array

        return result;
    }

    static void combinationSum(int index, int[] arr, int targetSum, List<List<Integer>> ans, List<Integer> list) {

        if(targetSum == 0) {

            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            if(i > index && arr[i] == arr[i-1]) continue;   // If it's a repeated element, then continue
            if(arr[i] > targetSum) break;

            list.add(arr[i]);
            combinationSum(i+1, arr, targetSum-arr[i], ans, list);
            list.removeLast();
        }
    }
}