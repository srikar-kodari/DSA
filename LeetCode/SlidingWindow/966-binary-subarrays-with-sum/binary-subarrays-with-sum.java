class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int ans = totalSubarraysWithSumLessThanGoal(nums, goal)
                    - totalSubarraysWithSumLessThanGoal(nums, goal-1);

        return ans;
    }

    // This Method Computes Count Of Subarrays <= goal
    static int totalSubarraysWithSumLessThanGoal(int[] nums, int goal) {

        if(goal < 0) return 0;

        int n = nums.length;
        int left = 0, right = 0, sum = 0, count = 0;

        while (right < n) {
            
            sum += nums[right];

            while (sum > goal) {
                sum = sum - nums[left];
                left++;
            }

            count = count + (right - left + 1);
            right++;
        }

        return count;
    }
}