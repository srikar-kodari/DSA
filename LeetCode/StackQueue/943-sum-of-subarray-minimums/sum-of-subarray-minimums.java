class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int mod = 1_000_000_007;
        int n = arr.length;
        int[] prevSmall = prevSmallerIndex(arr);
        int[] nextSmall = nextSmallerIndex(arr);

        long sum = 0;

        for(int i=0; i<n; i++) {

            long left = i - prevSmall[i];
            long right = nextSmall[i] - i;

            long totalWays = left * right;

            long totalSum = arr[i] * totalWays;

            sum = (sum + totalSum) % mod;
        }

        return (int) sum;
    }

    static int[] prevSmallerIndex(int[] nums) {     // If stack is empty (Ele not present), adds -1

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] pSE = new int[n];

        for(int i=0; i<n; i++) {

            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]) {   // Strictly Greater - Condition to Remove Duplicate Count. Vice versa with nextSmallerIndex().
                stack.pop();
            }

            pSE[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);
        }

        return pSE;
    }

    static int[] nextSmallerIndex(int[] nums) {     // If stack is empty (Ele not present), adds n

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] nSE = new int[n];

        for(int i=n-1; i>=0; i--) {

            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {  // One should be >= and other should be >.
                stack.pop();
            }

            nSE[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }

        return nSE;
    }
}
