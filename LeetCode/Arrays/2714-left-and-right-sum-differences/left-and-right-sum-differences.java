class Solution {
    public int[] leftRightDifference(int[] arr) {

        int len = arr.length;

        int leftSum = 0;
        int rightSum = 0;

        int[] left = new int[len];
        int[] right = new int[len];

        int[] result = new int[len];

        for(int i=1; i<len; i++) {
            leftSum += arr[i-1];
            left[i] = leftSum;
        }

        for(int i=len-2; i>=0; i--) {
            rightSum += arr[i+1];
            right[i] = rightSum;
        }

        for(int i=0; i<len; i++) {
            result[i] = Math.abs(right[i] - left[i]);
        }

        return result;
    }
}