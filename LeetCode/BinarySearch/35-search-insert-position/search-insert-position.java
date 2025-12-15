class Solution {
    public int searchInsert(int[] nums, int target) {

        int bS = Arrays.binarySearch(nums, target);

        int result = (bS >= 0) ? bS : -bS-1;

        return result;  
    }
}