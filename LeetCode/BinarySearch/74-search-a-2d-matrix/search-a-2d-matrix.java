class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            if(matrix[i][0] <= target && target <= matrix[i][m-1]) {
                
                boolean result = Arrays.binarySearch(matrix[i], target) >= 0;
                return result;
            }
        }
        return false;
    }
}