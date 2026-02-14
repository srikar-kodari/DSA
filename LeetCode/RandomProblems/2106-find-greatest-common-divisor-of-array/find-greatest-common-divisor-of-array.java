class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[nums.length-1];
        while(a > 0 && b > 0) {
            if(a > b) a = a % b;
            else b = b % a;
        }

        if(a == 0) return b;
        else return a;
    }
}