class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int ele) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? Integer.compare(b[0], a[0]) : Integer.compare(b[1], a[1])
        );

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {

            maxHeap.add(new int[] {Math.abs(ele - arr[i]), arr[i]});

            if(maxHeap.size() > k) maxHeap.poll();
        }

        while (!maxHeap.isEmpty()) {
            list.add(maxHeap.poll()[1]);
        }

        Collections.sort(list);
        return list;
    }
}
