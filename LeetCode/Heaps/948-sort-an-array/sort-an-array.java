class Solution {
    public int[] sortArray(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        int[] ans = new int[n];
        int index = 0;

        for(int num : nums) pq.add(num);

        while(!pq.isEmpty()) ans[index++] = pq.poll();

        return ans;
    }
}