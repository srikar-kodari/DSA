class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int pointsLength = points.length;
        int queriesLength = queries.length;
        int[] result = new int[queriesLength];

        for(int i=0; i<queriesLength; i++) {
            for(int j=0; j<pointsLength; j++) {

                double check = Math.pow(queries[i][0] - points[j][0],2) + Math.pow(queries[i][1] - points[j][1],2);

                if(check <= Math.pow(queries[i][2],2)) result[i]++;
            }
        }

        return result;
    }
}