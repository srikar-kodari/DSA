class Solution {
    public int[] frequencySort(int[] arr) {
        
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                int freqCompare = Integer.compare(map.get(a), map.get(b));
                if (freqCompare != 0) {
                    return freqCompare;
                }
                return Integer.compare(b, a);
            }
        );

        for (int key : map.keySet()) {
            maxHeap.add(key);
        }

        int[] result = new int[n];
        int index = 0;

        while (!maxHeap.isEmpty()) {
            int key = maxHeap.poll();
            int count = map.get(key);

            for (int i = 0; i < count; i++) {
                result[index++] = key;
            }
        }

        return result;
    }
}
