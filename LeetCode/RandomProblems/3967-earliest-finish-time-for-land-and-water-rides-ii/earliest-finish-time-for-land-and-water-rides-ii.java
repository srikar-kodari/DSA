class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;

        long minA = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minA = Math.min(minA, (long) landStartTime[i] + landDuration[i]);
        }

        long minB = Long.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minB = Math.min(minB, (long) waterStartTime[j] + waterDuration[j]);
        }

        long ans = Long.MAX_VALUE;

        for (int j = 0; j < m; j++) {
            ans = Math.min(
                ans,
                (long) waterDuration[j] +
                Math.max((long) waterStartTime[j], minA)
            );
        }

        for (int i = 0; i < n; i++) {
            ans = Math.min(
                ans,
                (long) landDuration[i] +
                Math.max((long) landStartTime[i], minB)
            );
        }

        return (int) ans;
    }
}
