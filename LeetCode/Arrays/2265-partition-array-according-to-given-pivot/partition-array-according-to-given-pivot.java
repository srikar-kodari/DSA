class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        for(int n : nums) {
            if(n < pivot) smaller.add(n);
            else if(n > pivot) larger.add(n);
            else equal.add(n);
        }

        result.addAll(smaller);
        result.addAll(equal);
        result.addAll(larger);

        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}