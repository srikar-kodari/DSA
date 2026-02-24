class Solution {
    public List<List<Integer>> subsets(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        int n = arr.length;
        int subSets = 1 << n;   // 2^n -> (1 << n)

        for(int i=0; i < subSets; i++) {

            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++) {

                if((i & (1 << j)) != 0) list.add(arr[j]);
            }

            result.add(list);
        }

        return result;
    }
}