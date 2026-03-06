class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int n = points.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(i, (points[i][0]*points[i][0] + points[i][1]*points[i][1]));
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(map.get(b), map.get(a))
        );

        for(int key : map.keySet()) {

            maxHeap.add(key);
            
            if(maxHeap.size() > k) maxHeap.poll();
        }

        int[][] ans = new int[k][2];

        int i = 0;
        while (!maxHeap.isEmpty()) {
            int index = maxHeap.poll();

            ans[i++] = points[index];
        }

        return ans;
    }
}
