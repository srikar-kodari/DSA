class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        
        List<Integer> ans = new ArrayList<>();

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<n; i++) {

            if(!deque.isEmpty() && deque.getFirst() <= i-k) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[deque.getLast()] <= nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);

            if(i >= k-1) ans.add(nums[deque.getFirst()]);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}