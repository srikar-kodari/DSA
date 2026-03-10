class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int n = grid.length;

        int[] rowMax = new int[n];
        int[] colMax = new int[n];

        // Row Max
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
            }
        }

        // Col Max
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int totalIncrease = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int allowedHeight = Math.min(rowMax[i], colMax[j]);
                totalIncrease += allowedHeight - grid[i][j];
            }
        }

        return totalIncrease;
    }
}
