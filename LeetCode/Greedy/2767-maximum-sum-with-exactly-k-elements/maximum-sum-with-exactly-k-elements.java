class Solution {
    public int maximizeSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        for(int x : nums) max = Math.max(max, x);
        
        int sum = 0;
        while(k-- > 0) {
            sum += max;
            max += 1;
        }

        return sum;
    }
}
