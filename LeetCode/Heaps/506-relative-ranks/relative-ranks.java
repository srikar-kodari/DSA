class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int n = score.length;
        String[] result = new String[n];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(score[b], score[a])
        );

        for (int i = 0; i < n; i++) maxHeap.add(i);

        int rank = 1;

        while (!maxHeap.isEmpty()) {
            int index = maxHeap.poll();

            if (rank == 1) result[index] = "Gold Medal";
            else if (rank == 2) result[index] = "Silver Medal";
            else if (rank == 3) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(rank);

            rank++;
        }

        return result;
    }
}