class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int ans = niceSubarrays(nums, k) - niceSubarrays(nums, k-1);

        return ans;
    }

    // This Method Computes Count Of Subarrays <= k
    static int niceSubarrays(int[] nums, int k) {

        if(k < 0) return 0;

        int n = nums.length;
        int left = 0, right = 0, sum = 0, count = 0;

        while (right < n) {
            
            sum += nums[right] % 2;

            while (sum > k) {
                sum = sum - nums[left] % 2;
                left++;
            }

            count = count + (right - left + 1);
            right++;
        }

        return count;
    }
}