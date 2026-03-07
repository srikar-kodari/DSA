class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length % groupSize != 0) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : hand) map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(map.keySet());

        while (!minHeap.isEmpty()) {
            
            int start = minHeap.peek();

            for(int i = start; i < start + groupSize; i++) {

                if(!map.containsKey(i)) return false;

                map.put(i, map.get(i)-1);

                if(map.get(i) == 0) {
                    if(i != minHeap.peek()) return false;

                    minHeap.poll();
                }
            }
        }

        return true;
    }
}