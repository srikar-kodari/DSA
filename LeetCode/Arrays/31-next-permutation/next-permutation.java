class Solution {
    public int[] nextPermutation(int[] nums) {

        int ind = -1;
        int n = nums.length;

        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                ind = i;
                break;
            }
        }

        if(ind == -1) {
            Arrays.sort(nums);
            return nums;
        }

        for(int i=n-1; i>ind; i--) {
            if(nums[i] > nums[ind]) {
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        Arrays.sort(nums, ind+1, n);
        return nums;
    }
}