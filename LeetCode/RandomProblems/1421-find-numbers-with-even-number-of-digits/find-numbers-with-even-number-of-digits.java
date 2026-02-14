class Solution {
    public int findNumbers(int[] nums) {

        int result = 0;
        for(int i=0; i<nums.length; i++) {

            if(String.valueOf(nums[i]).length() % 2 == 0) result++;
        }

        return result;
    }
}